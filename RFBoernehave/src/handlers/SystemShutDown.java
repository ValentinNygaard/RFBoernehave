package handlers;

import handlers.AddressHandler;
import handlers.ChildHandler;
import handlers.EmployeeHandler;
import handlers.ParentHandler;

public class SystemShutDown {

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
    }

}
