import handlers.*;
import model.Employee;

public class Main {

    public static void main (final String [] args ){

        AddressHandler ah = AddressHandler.getAddressHandler();
        ParentHandler ph = ParentHandler.getParentHandler();
        ChildHandler ch = ChildHandler.getChildHandler();
        EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();

        ch.printList();

        System.out.println("Hello world");
    }
}
