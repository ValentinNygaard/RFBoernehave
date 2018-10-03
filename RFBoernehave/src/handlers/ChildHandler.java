package handlers;

import model.Address;
import model.Child;
import model.Parent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChildHandler {
    public List<Child> childList = new ArrayList<Child>();
    private static ChildHandler instance;

    private ChildHandler()
    {
        initChildList();
    }

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
        while (input.hasNextLine())
        {
            String fileLine = input.nextLine();
            String[] components = fileLine.split(",");
            int personId = Integer.parseInt(components[0]);
            String parentStringList = components[5];

            childList.add(new Child(personId,components[1],components[2],components[3],components[4], parseParentString(parentStringList))); // addressHandler.getAddressByID(addressID) er en reference til addresseID i listen
        }
    }

    private ArrayList<Parent> parseParentString(String parentStringList) {
        ParentHandler ph = ParentHandler.getParentHandler();
        ArrayList<Parent> parentArrayList = new ArrayList<>();
        Scanner input = new Scanner(parentStringList);
        int count = 0;
        String[] components = parentStringList.split(":");
        for(int i = 0; i < components.length; i++)
        {
            int parentId = Integer.parseInt(components[i]);
            parentArrayList.add(ph.getParentByID(parentId));
        }
        return parentArrayList;
    }

    public void printList()
    {
        for(Child c : childList)
        {
            System.out.println(c.fileToString());
        }
    }

    public void saveChildList() {
        FileHandling fileHandling = new FileHandling();
        StringBuilder sb = new StringBuilder();
        for (Child child : childList) {
            sb.append(child.fileToString());
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        fileHandling.writeFile(sb.toString(),"data/childList.txt");
    }


    public void addChild(int personId, String cprNumber, String firstName, String lastName, String room, List<Parent> parents) {
        childList.add(new Child(personId,cprNumber,firstName,lastName,room,parents));
        // saveAddressList(); kan implementeres
    }

    public boolean deleteChild(int personId) {
        boolean delete = false;
        for (Child c: childList){
            if (c.getPersonId() == personId){
                childList.remove(childList.indexOf(c));
                return true;
            }
        }
        return false;
    }

    public void updateChild(int personId ,String cprNumber, String firstName, String lastName, String room, List<Parent> parents) {
        for(Child c : childList)
        {
            if (c.getPersonId() == personId)
            {
                c.setCprNumber(cprNumber);
                c.setFirstName(firstName);
                c.setLastName(lastName);
                c.setRoom(room);
                c.setParents(parents);
            }
        }
    }

    public Child searchChildByFirstName(String firstName){
        Child child = null;
        for(Child c : childList)
        {
            if(c.getFirstName().equals(firstName))
            {
                child = c;
                return child;
            }
        }
        return child;
    }

    public Child searchChildByLastName(String lastName){
        Child child = null;
        for(Child c : childList)
        {
            if(c.getLastName().equals(lastName))
            {
                child = c;
                return child;
            }
        }
        return child;
    }

    public void printTelephoneChildParentList()
    {
        for(Child c : childList)
        {
            System.out.println("Childs name: " + c.getFirstName() + " " + c.getLastName());
            System.out.println("        " + c.printParents(c.getParents()));
        }
    }
}
