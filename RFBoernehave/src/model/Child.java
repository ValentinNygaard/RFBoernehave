package model;

import java.util.ArrayList;
import java.util.List;

public class Child extends Person{

    private String room;
    private List<Parent> parents = new ArrayList<>(); //vi skal vælge en type af liste.

    public Child(int personId, String cprNumber, String firstName, String lastName, String room, List<Parent> parents) {
        super(personId, cprNumber, firstName, lastName);
        this.room = room;
        this.parents = parents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public String fileToString()
    {
        return super.getPersonId()+ "," +super.getCprNumber()+"," +super.getFirstName()+"," +super.getLastName()+"," + room +","+ printParents();
    }

    private String printParents()
    {
        System.out.println("List size: " + parents.size());
        System.out.println("Hej: " + parents.get(0).getFirstName());
        StringBuilder sb = new StringBuilder();
        for(Parent p : parents)
        {
            System.out.println(p.getPersonId());
            sb.append(p.getPersonId());
            sb.append(":");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
