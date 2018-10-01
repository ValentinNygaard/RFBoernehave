package model;

public class Employee extends Person{

    private int employeeNr;
    private int telephoneNumber;
    private Address employeeAddress;

    public Employee(int personId, int cprNumber, String firstName, String lastName, int employeeNr, int telephoneNumber, Address employeeAddress) {
        super(personId, cprNumber, firstName, lastName);
        this.employeeNr = employeeNr;
        this.telephoneNumber = telephoneNumber;
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeNr() {
        return employeeNr;
    }

    public void setEmployeeNr(int employeeNr) {
        this.employeeNr = employeeNr;
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
}
