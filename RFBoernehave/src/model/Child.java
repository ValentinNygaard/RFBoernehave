package model;

import java.util.List;

public class Child extends Person{

    private String room;
    private List<Parent> parents; //vi skal vælge en type af liste.

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
        return super.getPersonId()+ "," +super.getCprNumber()+"," +super.getFirstName()+"," +super.getLastName()+"," + room +","+ printParents(parents);
    }

    public String printParents(List<Parent> parents)
    {
        StringBuilder sb = new StringBuilder();
        for(Parent p : parents)
        {
            sb.append(p.getPersonId());
            sb.append(":");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
