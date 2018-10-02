package model;

public abstract class Person {

    private int personId;
    private String cprNumber;
    private String firstName;
    private String lastName;

    public Person(int personId, String cprNumber, String firstName, String lastName) {
        this.personId = personId;
        this.cprNumber = cprNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getCprNumber() {
        return cprNumber;
    }

    public void setCprNumber(String cprNumber) {
        this.cprNumber = cprNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract String fileToString();
}
