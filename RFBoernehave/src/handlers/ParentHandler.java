package handlers;

import menu.Output;
import menu.UserDialog;
import model.Address;
import model.Parent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParentHandler {

    private List<Parent> parentList = new ArrayList<>();
    private static ParentHandler instance;

    private ParentHandler()
    {
        initParentList();
    }

    public static ParentHandler getParentHandler(){
        if(instance == null){
            ParentHandler ph = new ParentHandler();
            instance = ph;
        }
        return instance;
    }

    private void initParentList() {
        FileHandling fileHandling = new FileHandling();
        Scanner input = new Scanner(fileHandling.readFile("data/parentList.txt"));
        AddressHandler addressHandler = AddressHandler.getAddressHandler(); // singleton fra AddressHandler
        while (input.hasNextLine())
        {
            String fileLine = input.nextLine();
            String[] components = fileLine.split(",");
            int personId = Integer.parseInt(components[0]);
            int addressID = Integer.parseInt(components[4]);
            int telephoneNumber = Integer.parseInt(components[5]);
            boolean isAddressParent = Boolean.parseBoolean(components[6]);
            boolean isCustodyParent = Boolean.parseBoolean(components[7]);
            parentList.add(new Parent(personId,components[1],components[2],components[3],addressHandler.getAddressByID(addressID),telephoneNumber,isAddressParent,isCustodyParent)); // addressHandler.getAddressByID(addressID) er en reference til addresseID i listen
        }
    }

    public void saveParentList() {
        FileHandling fileHandling = new FileHandling();
        StringBuilder sb = new StringBuilder();
        for (Parent parent : parentList) {
            sb.append(parent.fileToString());
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        fileHandling.writeFile(sb.toString(),"data/parentList.txt");
    }

    public void addParent(String cprNumber, String firstName, String lastName, Address parentAddress, int telephoneNumber, boolean isAddressParent, boolean isCustodyParent) {
        parentList.add(new Parent(cprNumber,firstName,lastName,parentAddress,telephoneNumber,isAddressParent,isCustodyParent));
        // saveAddressList(); kan implementeres
    }

    public Parent userCreate() {
        UserDialog input = new UserDialog();
        Output output = new Output();
        output.askParentInfo();
        String firstName = input.getFirstName();
        String lastName = input.getLastName();
        String cprNumber = input.getCprNumber();
        int telephoneNumber = input.getTelephoneNumber();
        AddressHandler ah = AddressHandler.getAddressHandler();
        Address parentAddress = ah.userCreate();
        boolean isAddressParent = true;
        boolean isCustodyParent = true;
        parentList.add(new Parent(cprNumber,firstName,lastName,parentAddress,telephoneNumber,isAddressParent,isCustodyParent));
        return parentList.get(parentList.size()-1);
    }

    public boolean deleteParent(int personId) {
        boolean delete = false;
        for (Parent p: parentList){
            if (p.getPersonId() == personId){
                parentList.remove(parentList.indexOf(p));
                return true;
            }
        }
        return false;
    }

    public Parent getParentByID(int personId) {
        Parent parent = null;
        for (Parent p: parentList){
            if (p.getPersonId() == personId){
                parent = p;
                return parent;
            }
        }
        return parent;
    }

    public void updateParent(int personId, String cprNumber, String firstName, String lastName, Address parentAddress, int telephoneNumber, boolean isAddressParent, boolean isCustodyParent) {
           for(Parent p : parentList)
        {
            if (p.getPersonId() == personId)
            {
                p.setCprNumber(cprNumber);
                p.setFirstName(firstName);
                p.setLastName(lastName);
                p.setParentAddress(parentAddress);
                p.setTelephoneNumber(telephoneNumber);
                p.setAddressParent(isAddressParent);
                p.setCustodyParent(isCustodyParent);
            }
        }
    }

    public Parent searchParentByFirstName(String firstName){
        Parent parent = null;
        for(Parent p : parentList)
        {
            if(p.getFirstName().equalsIgnoreCase(firstName))
            {
                parent = p;
            return parent;
            }
        }
        return parent;
    }

    public Parent searchParentByLastName(String lastName){
        Parent parent = null;
        for(Parent p : parentList)
        {
            if(p.getLastName().equalsIgnoreCase(lastName))
            {
                parent = p;
                return parent;
            }
        }
        return parent;
    }

    public void printList()
    {
        for(Parent p : parentList)
        {
            System.out.println(p.fileToString());
        }
    }
}
