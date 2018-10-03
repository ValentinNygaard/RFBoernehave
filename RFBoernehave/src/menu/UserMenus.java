package menu;

import handlers.*;

public class UserMenus {

    Output output = new Output();
    UserDialog ud = new UserDialog();

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
            else if(choice == 2)
            {
                WaitListMenu mm = new WaitListMenu();
                mm.waitListChildMenu();
            }
            else if(choice == 3)
            {
                WorkScheduleMenu wm = new WorkScheduleMenu();
                wm.showWorkScheduleMenu();
            }
            else if(choice == 4)
            {
                SearchMenu sm = new SearchMenu();
                sm.findPersonMenu();
            }
            else if(choice == 5)
            {
                TelephoneListMenu tm = new TelephoneListMenu();
                tm.telephoneListMenu();
            }
            else if(choice == 6)
            {
                PersonCrudMenu pm = new PersonCrudMenu();
                pm.personCrudMenu();
            }
            else if(choice == 7)
            {
                ScheduleAdministrationMenu sam = new ScheduleAdministrationMenu();
                sam.scheduleAdministrationMenu();
            }
            else if(choice == 8)
            {
                WaitListAdministration wam = new WaitListAdministration();
                wam.waitListAdministration();
            }
        }

    }

    private void registerChildMenu()
    {
        output.registerChildMenu();
        int choice = ud.getChoice(0,2);
        if(choice == 0) {} // Do nothing and return to mainMenu
        else if(choice == 1)
        {
            output.registerChild();
            ChildHandler ch = ChildHandler.getChildHandler();
            ch.userCreate();
        }
        else if(choice == 2)
        {
            WaitListMenu mm = new WaitListMenu();
            mm.waitListChildMenu();
        }
    }
}
