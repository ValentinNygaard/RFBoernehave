package handlers;

import model.Employee;

import java.util.ArrayList;
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
            int employeeNr = Integer.parseInt(components[4]);
            int telephoneNumber = Integer.parseInt(components[5]);
            int addressID = Integer.parseInt(components[6]);
            employeeList.add(new Employee(personId,cprNumber,components[2],components[3],employeeNr,telephoneNumber,addressHandler.getAddressByID(addressID))); // addressHandler.getAddressByID(addressID) er en reference til addresseID i listen
        }
    }
}
