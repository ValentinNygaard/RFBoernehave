package menu;

public class Output {

    public void printHeader()
    {
        System.out.println("______          _    _ _     _         __      _        _                     _                     ");
        System.out.println("| ___ \\        | |  (_) |   | |       / _|    (_)      | |                   | |                    ");
        System.out.println("| |_/ /___  ___| | ___| | __| | ___  | |_ _ __ _  ___  | |__  _ __ _ __   ___| |__   __ ___   _____ ");
        System.out.println("|    // _ \\/ __| |/ / | |/ _` |/ _ \\ |  _| '__| |/ _ \\ | '_ \\| '__| '_ \\ / _ \\ '_ \\ / _` \\ \\ / / _ \\");
        System.out.println("| |\\ \\ (_) \\__ \\   <| | | (_| |  __/ | | | |  | |  __/ | |_) | |  | | | |  __/ | | | (_| |\\ V /  __/");
        System.out.println("\\_| \\_\\___/|___/_|\\_\\_|_|\\__,_|\\___| |_| |_|  |_|\\___| |_.__/|_|  |_| |_|\\___|_| |_|\\__,_| \\_/ \\___|");
        System.out.println();
    }

    public void startMenu()
    {
        printHeader();
        System.out.println("0: Gem ændringer og luk systemet ned:");
        System.out.println("1: indskriv barn:");
        System.out.println("2: Sæt barn på venteliste:");
        System.out.println("3: se vagtplan:");
        System.out.println("4: find person:");
        System.out.println("5: se telefonliste:");
        System.out.println("6: administrer person:");
        System.out.println("7: administrer vagtplan:");
        System.out.println("8: administrer venteliste:");
    }

    public void registerChildMenu(){
        printHeader();
        System.out.println("0: Retur til hovedmenu:");
        System.out.println("1: Opret nyt barn:");
        System.out.println("2: Indskriv barn fra venteliste:");
    }

    public void telephoneListMenu()
    {
        printHeader();
        System.out.println("0: Retur til hovedmenu: ");
        System.out.println("1: Telefonliste for medarbejdere: ");
        System.out.println("2: Telefonliste over børnenes forældre: ");
    }

    public void findPersonMenu()
    {
        printHeader();
        System.out.println("0: Retur til hovedmenu: ");
        System.out.println("1: find data om et barn: ");
        System.out.println("2: find data om en  medarbejder: ");
        System.out.println("3: fin data om en forældre: ");
    }

    public void findChildMenu()
    {
        System.out.println("1: søg på barns fornavn:");
        System.out.println("2: søg på barns efternavn:");
    }

    public void findEmployeeMenu()
    {
        System.out.println("1: søg på medarbejders fornavn:");
        System.out.println("2: søg på medarbejders efternavn:");
    }

    public void findParentMenu()
    {
        System.out.println("1: søg på forældres fornavn:");
        System.out.println("2: søg på forældres efternavn:");
    }

    public void inputFirstName()
    {
        System.out.println("skriv fornavnet der skal søges på");
    }

    public void inputLastName()
    {
        System.out.println("skriv efternavnet der skal søges på");
    }
}
