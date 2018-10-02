package handlers;

import model.Address;
import model.Parent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ParentHandler {

    public List<Parent> parentList = new ArrayList<>();
    private static ParentHandler instance;

    public static ParentHandler getEmployeeHandler(){
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
            int cprNumber = Integer.parseInt(components[1]);
            int parentId = Integer.parseInt(components[4]);
            int addressID = Integer.parseInt(components[5]);
            int telephoneNumber = Integer.parseInt(components[6]);
            boolean isAddressParent = Boolean.parseBoolean(components[7]);
            boolean isCustodyParent = Boolean.parseBoolean(components[8]);
            parentList.add(new Parent(personId,cprNumber,components[2],components[3],parentId,addressHandler.getAddressByID(addressID),telephoneNumber,isAddressParent,isCustodyParent)); // addressHandler.getAddressByID(addressID) er en reference til addresseID i listen
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

    public void addParent(int personId, int cprNumber, String firstName, String lastName, int parentId, Address parentAddress, int telephoneNumber, boolean isAddressParent, boolean isCustodyParent) {
        parentList.add(new Parent(personId,cprNumber,firstName,lastName,parentId,parentAddress,telephoneNumber,isAddressParent,isCustodyParent));
        // saveAddressList(); kan implementeres
    }

    public boolean deleteParent(int parentId) {
        boolean delete = false;
        for (Parent p: parentList){
            if (p.getParentId() == parentId){
                parentList.remove(parentList.indexOf(p));
                return true;
            }
        }
        return false;
    }

    public Parent getAddressByID(int parentId) {
        Parent parent = null;
        for (Parent p: parentList){
            if (p.getParentId() == parentId){
                parent = p;
                return parent;
            }
        }
        return parent;
    }

    public void updateParent(int cprNumber, String firstName, String lastName, int parentId, Address parentAddress, int telephoneNumber, boolean isAddressParent, boolean isCustodyParent) {
           for(Parent p : parentList)
        {
            if (p.getParentId() == parentId)
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
            if(p.getFirstName().equals(firstName))
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
            if(p.getLastName().equals(lastName))
            {
                parent = p;
                return parent;
            }
        }
        return parent;
    }
}
