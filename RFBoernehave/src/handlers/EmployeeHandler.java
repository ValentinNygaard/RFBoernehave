package handlers;

import menu.Output;
import model.Address;
import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeHandler {

    private Output output = new Output();

    private List<Employee> employeeList = new ArrayList<Employee>();
    private static EmployeeHandler instance;

    private EmployeeHandler(){
        initEmployeeList();
    }

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
            int telephoneNumber = Integer.parseInt(components[4]);
            int addressID = Integer.parseInt(components[5]);
            employeeList.add(new Employee(personId,components[1],components[2],components[3],telephoneNumber,addressHandler.getAddressByID(addressID))); // addressHandler.getAddressByID(addressID) er en reference til addresseID i listen
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

    public void addEmployee(String cprNumber, String firstName, String lastName, Address employeeAddress, int telephoneNumber) {
        employeeList.add(new Employee(cprNumber,firstName,lastName,telephoneNumber, employeeAddress));
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

    public void updateEmployee(int personId, String cprNumber, String firstName, String lastName, Address employeeAddress, int telephoneNumber) {
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
            if(e.getFirstName().equalsIgnoreCase(firstName))
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
            if(e.getLastName().equalsIgnoreCase(lastName))
            {
                employee = e;
                return employee;
            }
        }
        return employee;
    }

    public void printList()
    {
        for(Employee e : employeeList)
        {
            System.out.println(e.fileToString());
        }
    }

    public void printTelephoneList()
    {
        output.telephoneListEmployee();
        output.telephoneListEmployeeTableHeader();
        for(Employee e : employeeList)
        {
            System.out.println(e.toStringTelephoneList());
            //System.out.println((e.getFirstName() + " " + e.getLastName()) + " " + e.getTelephoneNumber());
        }
    }
}

