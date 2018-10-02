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
        System.out.println("1: indskriv barn:");
        System.out.println("2: Sæt barn på venteliste:");
        System.out.println("3: se vagtplan:");
        System.out.println("4: find person:");
        System.out.println("5: se telefonliste:");
        System.out.println("6: administrer person:");
        System.out.println("7: administrer vagtplan:");
        System.out.println("8: administrer venteliste:");
    }
}
