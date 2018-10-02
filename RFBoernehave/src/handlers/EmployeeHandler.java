package handlers;

import model.Address;
import model.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeHandler {

    public List<Employee> employeeList = new ArrayList<Employee>();
    private static EmployeeHandler instance;

    public static EmployeeHandler getEmployeeHandler(){
        if(instance == null){
            EmployeeHandler eh = new EmployeeHandler();
            instance = eh;
        }
        return instance;
    }

    private void initEmployeeList() {
        FileHandling fileHandling = new FileHandling();
        Scanner input = new Scanner(fileHandling.readFile("data/employeeList.txt"));
        AddressHandler addressHandler = AddressHandler.getAddressHandler(); // singleton fra AddressHandler
        while (input.hasNextLine())
        {
            String fileLine = input.nextLine();
            String[] components = fileLine.split(",");
            int personId = Integer.parseInt(components[0]);
            int cprNumber = Integer.parseInt(components[1]);
            int telephoneNumber = Integer.parseInt(components[5]);
            int addressID = Integer.parseInt(components[6]);
            employeeList.add(new Employee(personId,cprNumber,components[2],components[3],telephoneNumber,addressHandler.getAddressByID(addressID))); // addressHandler.getAddressByID(addressID) er en reference til addresseID i listen
        }
    }

    public void saveEmployeeList() {
        FileHandling fileHandling = new FileHandling();
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employeeList) {
            sb.append(employee.fileToString());
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        fileHandling.writeFile(sb.toString(),"data/employeeList.txt");
    }

    public void addEmployee(int personId, int cprNumber, String firstName, String lastName, Address employeeAddress, int telephoneNumber) {
        employeeList.add(new Employee(personId,cprNumber,firstName,lastName,telephoneNumber, employeeAddress));
        // saveAddressList(); kan implementeres
    }

    public boolean deleteEmployee(int personId) {
        boolean delete = false;
        for (Employee e: employeeList){
            if (e.getPersonId() == personId){
                employeeList.remove(employeeList.indexOf(e));
                return true;
            }
        }
        return false;
    }

    public Employee getAddressByID(int personId) {
        Employee employee = null;
        for (Employee e: employeeList){
            if (e.getPersonId() == personId){
                employee = e;
                return employee;
            }
        }
        return employee;
    }

    public void updateEmployee(int personId, int cprNumber, String firstName, String lastName, Address employeeAddress, int telephoneNumber) {
        for(Employee e : employeeList)
        {
            if (e.getPersonId() == personId)
            {
                e.setCprNumber(cprNumber);
                e.setFirstName(firstName);
                e.setLastName(lastName);
                e.setEmployeeAddress(employeeAddress);
                e.setTelephoneNumber(telephoneNumber);
            }
        }
    }

    public Employee searchEmployeeByFirstName(String firstName){
        Employee employee = null;
        for(Employee e : employeeList)
        {
            if(e.getFirstName().equals(firstName))
            {
                employee = e;
                return employee;
            }
        }
        return employee;
    }

    public Employee searchEmployeeByLastName(String lastName){
        Employee employee = null;
        for(Employee e : employeeList)
        {
            if(e.getLastName().equals(lastName))
            {
                employee = e;
                return employee;
            }
        }
        return employee;
    }
}

