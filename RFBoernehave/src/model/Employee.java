package model;

public class Employee extends Person{

    private int telephoneNumber;
    private Address employeeAddress;

    public Employee(String cprNumber, String firstName, String lastName, int telephoneNumber, Address employeeAddress) {
        super(cprNumber, firstName, lastName);
        this.telephoneNumber = telephoneNumber;
        this.employeeAddress = employeeAddress;
    }

    public Employee(int personId, String cprNumber, String firstName, String lastName, int telephoneNumber, Address employeeAddress) {
        super(personId, cprNumber, firstName, lastName);
        this.telephoneNumber = telephoneNumber;
        this.employeeAddress = employeeAddress;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String fileToString()
    {
        return super.getPersonId()+ "," +super.getCprNumber()+"," +super.getFirstName()+"," +super.getLastName()+"," + telephoneNumber + "," + employeeAddress.getAddressID();
    }
}
