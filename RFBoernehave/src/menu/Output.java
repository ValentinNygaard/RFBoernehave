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

    public void registerChildMenu(){
        System.out.println();
        System.out.println("INDSKRIV BARN");
        System.out.println();
        System.out.println("0: Retur til hovedmenu:");
        System.out.println();
        System.out.println("1: Opret nyt barn:");
        System.out.println("2: Indskriv barn fra venteliste:");
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


}