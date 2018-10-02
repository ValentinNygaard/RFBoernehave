package handlers;

import model.Address;
import model.Child;
import model.Parent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChildHandler {/*
    public List<Child> childList = new ArrayList<Child>();
    private static ChildHandler instance;

    public static ChildHandler getChildHandler(){
        if(instance == null){
            ChildHandler ch = new ChildHandler();
            instance = ch;
        }
        return instance;
    }
//(int personId, int cprNumber, String firstName, String lastName, String room, int birthDate, List<Parent> parents)
    private void initChildList() {
        FileHandling fileHandling = new FileHandling();
        Scanner input = new Scanner(fileHandling.readFile("data/childList.txt"));
        AddressHandler addressHandler = AddressHandler.getAddressHandler(); // singleton fra AddressHandler
        while (input.hasNextLine())
        {
            String fileLine = input.nextLine();
            String[] components = fileLine.split(",");
            int personId = Integer.parseInt(components[0]);
            int cprNumber = Integer.parseInt(components[1]);
            int birthDate = Integer.parseInt(components[5]);
            String parentStringList = components[6];

            childList.add(new Child(personId,cprNumber,components[2],components[3],components[4],birthDate, parentStringList)); // addressHandler.getAddressByID(addressID) er en reference til addresseID i listen
        }
    }

    private ArrayList<Parent> parseParentString(String parentString) {
        Scanner input = new Scanner(parentString);
        while (input.hasNext())
        {
            String fileLine = input.nextLine();
            String[] components = fileLine.split(":");
            int parentInt =

            childList.add(new Child(personId,cprNumber,components[2],components[3],components[4],birthDate, parentStringList)); // addressHandler.getAddressByID(addressID) er en reference til addresseID i listen
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
        fileHandling.writeFile(sb.toString(),"data/addressList.txt");
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
    }*/
}
