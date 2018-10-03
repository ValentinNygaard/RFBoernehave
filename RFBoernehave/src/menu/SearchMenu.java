package menu;

import handlers.ChildHandler;
import handlers.EmployeeHandler;
import handlers.InputHandler;
import handlers.ParentHandler;

public class SearchMenu {

    InputHandler input = new InputHandler();

    public void findPersonMenu()
    {
        Output output = new Output();
        output.findParentMenu();
        int choice = input.getInt(0,3,"Du skal skrive et tal ", "tallet skal være imellem 0 og 3");

        if(choice == 0)
        {
            MainMenu mainMenu = new MainMenu();
            mainMenu.start();
        }
        else if(choice == 1)
        {
            output.findChildMenu();
            ChildHandler ch = ChildHandler.getChildHandler();
            int searchChoice = input.getInt(1,2,"Du skal skrive et tal ", "tallet skal være imellem 1 og 2");

            if(searchChoice == 1)
            {
                output.inputFirstName();
                String s = input.getString();
                System.out.println(ch.searchChildByFirstName(s).fileToString());
            }
            else if(searchChoice == 2)
            {
                output.inputLastName();
                String s = input.getString();
                System.out.println(ch.searchChildByLastName(s).fileToString());
            }
            findPersonMenu();
        }
        else if(choice == 2)
        {
            output.findEmployeeMenu();
            EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();
            int searchChoice = input.getInt(1,2,"Du skal skrive et tal ", "tallet skal være imellem 1 og 2");
            if(searchChoice == 1)
            {
                output.inputFirstName();
                String s = input.getString();
                System.out.println(eh.searchEmployeeByFirstName(s).fileToString());
            }
            else if(searchChoice == 2)
            {
                output.inputLastName();
                String s = input.getString();
                System.out.println(eh.searchEmployeeByLastName(s).fileToString());
            }
            findPersonMenu();
        }
        else if(choice == 3)
        {
            output.findParentMenu();
            ParentHandler ph = ParentHandler.getParentHandler();
            int searchChoice = input.getInt(1,2,"Du skal skrive et tal ", "tallet skal være imellem 1 og 2");

            if(searchChoice == 1)
            {
                output.inputFirstName();
                String s = input.getString();
                System.out.println(ph.searchParentByFirstName(s).fileToString());
            }
            else if(searchChoice == 2)
            {
                output.inputLastName();
                String s = input.getString();
                System.out.println(ph.searchParentByLastName(s).fileToString());
            }
            findPersonMenu();
        }
    }
}
