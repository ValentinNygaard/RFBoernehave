package menu;

import handlers.ChildHandler;
import handlers.EmployeeHandler;
import handlers.InputHandler;

public class TelephoneListMenu {

    InputHandler input = new InputHandler();

    public void telephoneListMenu()
    {
        Output output = new Output();
        output.telephoneListMenu();
        int choice = input.getInt(0,2,"Du skal skrive et tal ", "tallet skal være imellem 0 og 2");

        if(choice == 0)
        {
            MainMenu mainMenu = new MainMenu();
            mainMenu.start();
        }
        else if(choice == 1)
        {
            EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();
            eh.printTelephoneList();
            telephoneListMenu();

        }
        else if(choice == 2)
        {
            ChildHandler ch = ChildHandler.getChildHandler();
            ch.printTelephoneChildParentList();
            telephoneListMenu();
        }
    }
}
