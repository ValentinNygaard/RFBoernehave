package menu;

import handlers.InputHandler;

public class UserDialog {

    InputHandler input = new InputHandler();

    public int getChoice(int min, int max) {
        System.out.print("Vælg i menuen (" + min + "-" + max +"): ");
        return input.getInt(0,8,"Du skal skrive et tal ", "tallet skal være imellem " + min + " og " + max + ": ");
    }

    public String getFirstName() {
        System.out.print("Fornavn:       ");
        return input.getString();
    }

    public String getLastName() {
        System.out.print("Efternavn:     ");
        return input.getString();
    }

    public String getCprNumber() {
        System.out.print("Cprnummer:     ");
        return input.getString();
    }

    public int getTelephoneNumber() {
        System.out.print("Telefonnummer: ");
        return input.getInt("Kun tal er tilladt: ");
    }

    public String getStreetName() {
        System.out.print("Vejnavn:       ");
        return input.getString();
    }

    public String getStreetNumber() {
        System.out.print("Vejnummer:     ");
        return input.getString();
    }

    public int getPostalCode() {
        System.out.print("Postnummer:    ");
        return input.getInt(1000, 9999,"Kun tal er tilladt: ","Postnummeret skal være mellem 1000 og 9999: ");
    }

    public String getCity() {
        System.out.print("By:            ");
        return input.getString();
    }

    public String getCountry() {
        System.out.print("Land:          ");
        return input.getString();
    }

}

