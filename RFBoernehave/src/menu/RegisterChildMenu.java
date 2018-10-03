package menu;

import com.sun.tools.javac.Main;
import handlers.ChildHandler;
import handlers.InputHandler;
import handlers.SystemShutDown;
import menu.*;
import model.Child;

public class RegisterChildMenu {

    Output output = new Output();
    InputHandler input = new InputHandler();

    public void registerChildMenu()
    {

        output.registerChildMenu();
        int choice = input.getInt(0,2,"Du skal skrive et tal ", "Tallet skal være imellem 0 og 2");
        if(choice == 0)
        {
            MainMenu mm = new MainMenu();
            mm.start();
        }
        else if(choice == 1)
        {
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
