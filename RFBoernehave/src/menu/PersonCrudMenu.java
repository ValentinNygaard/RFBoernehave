package menu;

import com.sun.tools.javac.Main;
import handlers.*;
import model.Address;
import model.Child;
import model.Employee;
import model.Parent;


public class PersonCrudMenu {
    InputHandler input = new InputHandler();
    Output output = new Output();
    UserDialog ud = new UserDialog();

    public void personCrudMenu(){
        start();
        int choice = input.getInt(0,8,"Du skal skrive et tal ", "tallet skal være imellem 0 og 8");

        if(choice == 0)
        {
            MainMenu mm = new MainMenu();
            mm.start();
        }
        else if(choice == 1)
        {
            ChildHandler ch = ChildHandler.getChildHandler();
            Child child = ch.searchChildByFirstName(ud.getFirstName());
            child.setRoom(ud.getRoom());
        }
        else if(choice == 2)
        {
            output.changeParentInfo();
            int choiceTwo = input.getInt(1,2,"Du skal skrive et tal", "Tallet skal være mellem 1 og 2");
            if (choiceTwo == 1){
                AddressHandler ah = AddressHandler.getAddressHandler();
                ah.updateParentAddress();
                Address address = ah.getAddressByID(ud.getAddressId());
                address.setAddress(ud.getAddressId(),ud.getStreetName(),ud.getStreetNumber(),ud.getPostalCode(),ud.getCity(),ud.getCountry());
                ParentHandler ph = ParentHandler.getParentHandler();
                Parent parent = ph.getParentByID(ud.getAddressId());
                parent.setParentAddress(address);

            } else if (choiceTwo == 2){
                System.out.println("Start med ID på personen");
                ParentHandler ph = ParentHandler.getParentHandler();
                int telefonId = input.getInt("skriv tal");
                Parent parent = ph.getParentByID(telefonId);
                System.out.println("Skriv nyt telefon nummer");
                int parentTelephone = input.getInt("skriv tal");
                parent.setTelephoneNumber(parentTelephone); // ændre telefonnummeret på forældren

               // System.out.println(parentTwo.toString());
            }
        }
        else if(choice == 3)
        {
            output.changeEmployeeInfo();
            int choiceThree = input.getInt(1,2,"Du skal skrive et tal", "Tallet skal være mellem 1 og 2");
            if (choiceThree == 1){
                AddressHandler ah = AddressHandler.getAddressHandler();
                ah.updateParentAddress();
                Address address = ah.getAddressByID(ud.getAddressId());
                address.setAddress(ud.getAddressId(),ud.getStreetName(),ud.getStreetNumber(),ud.getPostalCode(),ud.getCity(),ud.getCountry());
                EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();
                Employee employee = eh.getAddressByID(ud.getAddressId());
                employee.setEmployeeAddress(address);
            } else if (choiceThree == 2){
                System.out.println("Start med ID på personen");
                EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();
                int telefonId = input.getInt("skriv tal");
                Employee employee = eh.getAddressByID(telefonId);
                System.out.println("Skriv nyt telefon nummer");
                int employeeTelephone = input.getInt("skriv tal");
                employee.setTelephoneNumber(employeeTelephone); // ændre telefonnummeret på forældren

                System.out.println(employee.toString());
            }
        }
    }

    public void start()
    {
        System.out.println("Hvem vil du ændre?");
        System.out.println("0: Gå tilbage");
        System.out.println("1: Barn");
        System.out.println("2: Forældre");
        System.out.println("3: Ansat");
    }
}
