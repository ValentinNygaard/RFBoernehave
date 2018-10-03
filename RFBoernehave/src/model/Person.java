package model;

public abstract class Person {

    private static int idCount = 1;
    private int personId;
    private String cprNumber;
    private String firstName;
    private String lastName;

    public Person(String cprNumber, String firstName, String lastName) {
        this.personId = idCount;
        this.cprNumber = cprNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        idCount++;
    }

    public Person(int personId, String cprNumber, String firstName, String lastName) {
        this.personId = personId;
        this.cprNumber = cprNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        idCount++;
    }

    public static void setIdCount(int i)
    {
        idCount = i;
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
