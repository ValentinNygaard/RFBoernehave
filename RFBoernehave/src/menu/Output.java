package menu;

public class Output {

    public void printHeader()
    {
        System.out.println();
        System.out.println();
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
        System.out.println();
        System.out.println("HOVEDMENU");
        System.out.println();
        System.out.println("0: Gem ændringer og luk systemet ned:");
        System.out.println();
        System.out.println("1: Indskriv barn:");
        System.out.println("2: Sæt barn på venteliste:");
        System.out.println("3: Se vagtplan:");
        System.out.println("4: Find person:");
        System.out.println("5: Se telefonliste:");
        System.out.println();
        System.out.println("6: Administrer person:");
        System.out.println("7: Administrer vagtplan:");
        System.out.println("8: Administrer venteliste:");
        System.out.println();
    }

    public void underConstruction(){
        System.out.println();
        System.out.println("DENNE DEL AF SYSTEMET ER UNDER UDVIKLING OG PT. IKKE TILGÆNGELIG");
    }

    public void registerChildMenu(){
        System.out.println();
        System.out.println("INDSKRIV BARN");
        System.out.println();
        System.out.println("0: Gå tilbage til hovedmenu");
        System.out.println();
        System.out.println("1: Opret nyt barn");
        System.out.println("2: Indskriv barn fra venteliste");
        System.out.println();
    }

    public void registerChild(){
        System.out.println();
        System.out.println("OPRET NYT BARN");
    }

    public void askChildInfo(){
        System.out.println();
        System.out.println("Indtast oplysninger om barnet: ");
        System.out.println();
    }

    public void askParentInfo(){
        System.out.println();
        System.out.println("Indtast oplysninger om forælder: ");
        System.out.println();
    }

    public void askEmployeeInfo(){
        System.out.println();
        System.out.println("Indtast oplysninger om medarbejder: ");
        System.out.println();
    }

    public void findPersonMenu()
    {
        printHeader();
        System.out.println();
        System.out.println("FIND PERSON MENU");
        System.out.println();
        System.out.println("0: Gå tilbage til hovedmenu");
        System.out.println();
        System.out.println("1: Find data om et barn");
        System.out.println("2: Find data om en medarbejder");
        System.out.println("3: Find data om en forældrer");
        System.out.println();
    }

    public void findChildMenu()
    {
        System.out.println("1: Søg på barns fornavn");
        System.out.println("2: Søg på barns efternavn");
    }

    public void findEmployeeMenu()
    {
        System.out.println("1: Søg på medarbejders fornavn");
        System.out.println("2: Søg på medarbejders efternavn");
    }

    public void findParentMenu()
    {
        System.out.println("1: Søg på forældres fornavn");
        System.out.println("2: Søg på forældres efternavn");
    }

    public void inputFirstName()
    {
        System.out.print("Skriv fornavnet der skal søges på: ");
    }

    public void inputLastName()
    {
        System.out.print("Skriv efternavnet der skal søges på: ");
    }

    public void telephoneListMenu()
    {
        printHeader();
        System.out.println();
        System.out.println("TELEFONLISTE MENU");
        System.out.println();
        System.out.println("0: Gå tilbage til hovedmenu");
        System.out.println();
        System.out.println("1: Udskriv telefonliste over medarbejdere");
        System.out.println("2: Udskriv telefonliste over børn og deres forældre");
        System.out.println();
    }

    public void telephoneListEmployee(){
        System.out.println();
        System.out.println("TELEFONLISTE OVER ANSATTE");
        System.out.println();
    }

    public void telephoneListEmployeeTableHeader(){
        System.out.println("Navn                Telefonmummer");
        System.out.println("---------------------------------");
    }

    public void telephoneListChildParent(){
        System.out.println();
        System.out.println("TELEFONLISTE OVER BØRN OG DERES FORÆLDRE");
        System.out.println();
    }

    public void nameNotFound()
    {
        System.out.println("Navnet er ikke på listen");
    }

    public void changeParentInfo(){
        System.out.println("Hvad vil du ændre");
        System.out.println("1: Adresse");
        System.out.println("2: Telefon");
    }
    public void changeEmployeeInfo(){
        System.out.println("Hvad vil du ændre");
        System.out.println("1: Adresse");
        System.out.println("2: Telefon");
    }
}
