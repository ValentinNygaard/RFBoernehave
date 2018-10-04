package menu;

import handlers.ChildHandler;
import handlers.EmployeeHandler;
import handlers.InputHandler;
import handlers.ParentHandler;
import model.Child;
import model.Employee;
import model.Parent;

public class SearchMenu {

    InputHandler input = new InputHandler();

    public void findPersonMenu()
    {
        Output output = new Output();
        output.findPersonMenu();
        int choice = input.getInt(0,3,"Du skal skrive et tal ", "tallet skal være imellem 0 og 3");

        if(choice == 0)
        { }
        else if(choice == 1)
        {
            output.findChildMenu();
            ChildHandler ch = ChildHandler.getChildHandler();
            int searchChoice = input.getInt(1,2,"Du skal skrive et tal ", "tallet skal være imellem 1 og 2");

            if(searchChoice == 1)
            {

                output.inputFirstName();
                String s = input.getString();
                Child child = ch.searchChildByFirstName(s);
                if(child != null) {
                    System.out.println(child.fileToString());
                }
                else{
                    output.nameNotFound();
                }
            }
            else if(searchChoice == 2)
            {
                output.inputLastName();
                String s = input.getString();
                Child child = ch.searchChildByLastName(s);
                if(child != null) {
                    System.out.println(child.fileToString());
                }
                else{
                    output.nameNotFound();
                }
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
                Employee employee = eh.searchEmployeeByFirstName(s);
                if(employee!=null)
                {
                    System.out.println(employee.fileToString());
                }
                else
                {
                    output.nameNotFound();
                }
            }
            else if(searchChoice == 2)
            {
                output.inputLastName();
                String s = input.getString();
                Employee employee = eh.searchEmployeeByLastName(s);
                if(employee!=null)
                {
                    System.out.println(employee.fileToString());
                }
                else
                {
                    output.nameNotFound();
                }
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
                Parent parent = ph.searchParentByFirstName(s);
                if(parent!=null)
                {
                    System.out.println(parent.fileToString());
                }
            }
            else if(searchChoice == 2)
            {
                output.inputLastName();
                String s = input.getString();
                Parent parent = ph.searchParentByLastName(s);
                if(parent!= null)
                {
                    System.out.println(parent.fileToString());
                }
            }
        }
    }
}
