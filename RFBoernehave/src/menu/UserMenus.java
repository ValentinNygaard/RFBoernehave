package menu;

import handlers.*;

public class UserMenus {

    private Output output = new Output();
    private UserDialog ud = new UserDialog();

    public void mainMenu()
    {
        boolean running = true;
        while (running) {
            output.startMenu();
            int choice = ud.getChoice(0,8);

            if(choice == 0) {
                running = false; // exits loop and returns to main and continues with System Shutdown
            }
            else if(choice == 1)
                registerChildMenu();
            else if(choice == 2) {
                output.underConstruction();
            }
            else if(choice == 3) {
                output.underConstruction();
            }
            else if(choice == 4) {
                SearchMenu sm = new SearchMenu();
                sm.findPersonMenu();
            }
            else if(choice == 5) {
                telephoneListMenu();
            }
            else if(choice == 6) {
                PersonCrudMenu pm = new PersonCrudMenu();
                pm.personCrudMenu();
            }
            else if(choice == 7) {
                output.underConstruction();
            }
            else if(choice == 8) {
                output.underConstruction();
            }
        }
    }

    private void registerChildMenu()
    {
        output.registerChildMenu();
        int choice = ud.getChoice(0,2);
        if(choice == 0) {
            mainMenu();
        } // Do nothing and return to mainMenu
        else if(choice == 1) {
            output.registerChild();
            ChildHandler ch = ChildHandler.getChildHandler();
            ch.userCreate();
        }
        else if(choice == 2) {
            output.underConstruction();
        }
    }

    private void telephoneListMenu()
    {
        output.telephoneListMenu(); //lav metoden
        int choice = ud.getChoice(0,2);

        if(choice == 0) {
        }
        else if(choice == 1) {
            EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();
            eh.printTelephoneList();
            telephoneListMenu();
        }
        else if(choice == 2) {
            ChildHandler ch = ChildHandler.getChildHandler();
            ch.printTelephoneChildParentList();
            telephoneListMenu();
        }
    }
}
