package model;

import java.util.List;

public class Child extends Person{

    private String room;
    private int birthDate;
    private List<Parent> parents; //vi skal vælge en type af liste.

    public Child(int personId, int cprNumber, String firstName, String lastName, String room, int birthDate, List<Parent> parents) {
        super(personId, cprNumber, firstName, lastName);
        this.room = room;
        this.birthDate = birthDate;
        this.parents = parents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }
}
