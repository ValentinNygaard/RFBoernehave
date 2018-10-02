package menu;

import handlers.*;

public class MainMenu {

    Output output = new Output();
    InputHandler input = new InputHandler();

    public void start()
    {
        output.startMenu();
        int choice = input.getInt(1,8,"Du skal skrive et tal ", "tallet skal være imellem 1 og 8");

        if(choice == 1)
        {
            RegisterChildMenu rg = new RegisterChildMenu();
            rg.registerChildMenu();
        }
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
