package models;

import java.util.List;

public class Child {

    private String room;
    private int birthDate;
    private List<Parent> parents; //vi skal vælge en type af liste.

    public Child(String room, int birthDate, List<Parent> parents) {
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
