package handlers;

import handlers.AddressHandler;
import handlers.ChildHandler;
import handlers.EmployeeHandler;
import handlers.ParentHandler;
import model.Person;

import java.util.Scanner;

public class SystemHandler {

    public void start()
    {
        AddressHandler ah = AddressHandler.getAddressHandler();
        ParentHandler ph = ParentHandler.getParentHandler();
        EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();
        ChildHandler ch = ChildHandler.getChildHandler();
        FileHandling fh = new FileHandling();
        Scanner sh = new Scanner(fh.readFile("data/systemdata.txt"));
        Person.setIdCount(sh.nextInt());
    }

    public void shutDown()
    {
        AddressHandler ah = AddressHandler.getAddressHandler();
        ParentHandler ph = ParentHandler.getParentHandler();
        EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();
        ChildHandler ch = ChildHandler.getChildHandler();
        ah.saveAddressList();
        ph.saveParentList();
        eh.saveEmployeeList();
        ch.saveChildList();
        //sace static var i fil
    }

    public void testPrint() {
        AddressHandler ah = AddressHandler.getAddressHandler();
        ParentHandler ph = ParentHandler.getParentHandler();
        EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();
        ChildHandler ch = ChildHandler.getChildHandler();
        ch.printList();
    }


}
