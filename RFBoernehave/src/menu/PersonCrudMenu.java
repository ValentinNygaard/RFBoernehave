package menu;

import com.sun.tools.javac.Main;
import handlers.*;
import model.Address;
import model.Child;
import model.Employee;
import model.Parent;


public class PersonCrudMenu {
    InputHandler input = new InputHandler();

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
            System.out.println("Skriv barnets fornavn");
            String childName = input.getString();
            Child child = ch.searchChildByFirstName(childName);
            System.out.println("Ændre barnets stue til");
            String room = input.getString();
            child.setRoom(room);

        }
        else if(choice == 2)
        {
            System.out.println("Hvad vil du ændre");
            System.out.println("1: Adresse");
            System.out.println("2: Telefon");
            int choiceTwo = input.getInt(1,2,"Du skal skrive et tal", "Tallet skal være mellem 1 og 2");
            if (choiceTwo == 1){
                System.out.println("Skriv ny adresse");
                System.out.println("Start med id");
                AddressHandler ah = AddressHandler.getAddressHandler();
                int adresseID = input.getInt("skriv tal"); // finder adressen med det id
                Address address = ah.getAddressByID(adresseID);
                System.out.println("Skriv gadenavn");
                String steetName = input.getString();
                address.setStreetName(steetName);// ændre gadenavn
                System.out.println("Skriv gadenummer");
                int streetNumber = input.getInt("skriv nummer");
                address.setStreetNumber(steetName);// ændre gadenummer
                System.out.println("Skriv postnummer");
                int postalCode = input.getInt("skriv nummer");
                address.setPostalCode(postalCode);// ændre postnummer
                System.out.println("Skriv Bynavn");
                String city = input.getString();
                address.setCity(city); // ændre byen
                System.out.println("Skriv landekode");
                String country = input.getString();
                address.setCountry(country); // ændre land

                ParentHandler ph = ParentHandler.getParentHandler();
                Parent parent = ph.getParentByID(adresseID);
                parent.setParentAddress(address);

            } else if (choiceTwo == 2){
                System.out.println("Start med ID på personen");
                ParentHandler ph1 = ParentHandler.getParentHandler();
                int telefonId = input.getInt("skriv tal");
                Parent parentTwo = ph1.getParentByID(telefonId);
                System.out.println("Skriv nyt telefon nummer");
                int parentTelephone = input.getInt("skriv tal");
                parentTwo.setTelephoneNumber(parentTelephone); // ændre telefonnummeret på forældren

                System.out.println(parentTwo.toString());
            }
        }
        else if(choice == 3)
        {
            System.out.println("Hvad vil du ændre");
            System.out.println("1: Adresse");
            System.out.println("2: Telefon");
            int choiceThree = input.getInt(1,2,"Du skal skrive et tal", "Tallet skal være mellem 1 og 2");

            if (choiceThree == 1){
                System.out.println("Skriv ny adresse");
                System.out.println("Start med id");
                AddressHandler ah = AddressHandler.getAddressHandler();
                int adresseID = input.getInt("skriv tal"); // finder adressen med det id
                Address address = ah.getAddressByID(adresseID);
                System.out.println("Skriv gadenavn");
                String steetName = input.getString();
                address.setStreetName(steetName);// ændre gadenavn
                System.out.println("Skriv gadenummer");
                int streetNumber = input.getInt("skriv nummer");
                address.setStreetNumber(steetName);// ændre gadenummer
                System.out.println("Skriv postnummer");
                int postalCode = input.getInt("skriv nummer");
                address.setPostalCode(postalCode);// ændre postnummer
                System.out.println("Skriv Bynavn");
                String city = input.getString();
                address.setCity(city); // ændre byen
                System.out.println("Skriv landekode");
                String country = input.getString();
                address.setCountry(country); // ændre land
                System.out.println(address.toString());

                EmployeeHandler eh = EmployeeHandler.getEmployeeHandler();
                Employee employee = eh.getAddressByID(adresseID);
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
