import handlers.SystemHandler;
import menu.MainMenu;
import menu.UserMenus;

public class Main {

    public static void main (final String [] args ){

        SystemHandler sh = new SystemHandler();
        UserMenus um = new UserMenus();

        sh.start();
        //sh.testPrint();
        um.mainMenu();
        sh.shutDown();

    }
}
