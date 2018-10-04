package handlers;

import handlers.AddressHandler;
import handlers.ChildHandler;
import handlers.EmployeeHandler;
import handlers.ParentHandler;
import model.Address;
import model.Person;

import java.util.Scanner;

public class SystemHandler {

    private AddressHandler ah = AddressHandler.getAddressHandler();
    private ParentHandler ph = ParentHandler.getParentHandler();
    private EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();
    private ChildHandler ch = ChildHandler.getChildHandler();
    private FileHandling fh = new FileHandling();

    public void start()
    {
        Scanner sh = new Scanner(fh.readFile("data/systemdata.txt"));
        Person.setIdCount(sh.nextInt());
        Address.setIdCount(sh.nextInt());
    }

    public void shutDown()
    {
        ah.saveAddressList();
        ph.saveParentList();
        eh.saveEmployeeList();
        ch.saveChildList();
        fh.writeFile(Person.getIdCount() + " " + Address.getIdCount(), "data/systemdata.txt");
    }
}
