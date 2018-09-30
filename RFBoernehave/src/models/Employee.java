package models;

public class Employee {

    private int employeeNr;
    private int telephoneNumber;
    private Address employeeAddress;

    public Employee(int employeeNr, int telephoneNumber, Address employeeAddress) {
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
