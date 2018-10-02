package menu;

import com.sun.tools.javac.Main;
import handlers.InputHandler;
import handlers.SystemShutDown;
import menu.*;

public class RegisterChildMenu {

    Output output = new Output();
    InputHandler input = new InputHandler();

    public void registerChildMenu()
    {

        output.registerChildMenu();
        int choice = input.getInt(0,2,"Du skal skrive et tal ", "tallet skal være imellem 0 og 2");
        if(choice == 0)
        {
            MainMenu mm = new MainMenu();
            mm.start();
        }
        else if(choice == 1)
        {
            RegisterChildMenu rg = new RegisterChildMenu();
            rg.registerChildMenu();
        }
        else if(choice == 2)
        {
            WaitListMenu mm = new WaitListMenu();
            mm.waitListChildMenu();
        }

    }


}
