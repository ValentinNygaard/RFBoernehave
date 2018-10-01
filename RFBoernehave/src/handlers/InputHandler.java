package handlers;
// Handling user input

import java.util.Scanner;
import java.util.ArrayList;

public class InputHandler {

    // Simple String input - no checks

    public String getString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    // String input - only accepting inputs specified in ArrayList parameter

    public String getString(ArrayList<String> options, String errorMessage) {
        while(true)
        {
            String input = getString();
            if(options.contains(input)) return input;
            else System.out.print(errorMessage);
        }
    }

    // String input - only accepting inputs specified in Array parameter

    public String getString(String[] options, String errorMessage) {
        while(true) {
            String input = getString();
            for(String option : options) {
                if(input.equals(option)) return input;
            }
            System.out.print(errorMessage);
        }
    }

    // Base int input - only check if int

    public int getInt(String typeErrorMessage) {
        Scanner input = new Scanner(System.in);
        while(!input.hasNextInt()) {
            input.nextLine();
            System.out.print(typeErrorMessage);
        }
        return input.nextInt();
    }

    // int input - only accepting ints specified by min and max values

    public int getInt(int min, int max, String typeErrorMessage, String rangeErrorMessage) {
        while(true) {
            int value = getInt(typeErrorMessage);
            if(value >= min && value <= max) return value;
            else System.out.print(rangeErrorMessage);
        }
    }

    // int input - only accepting ints specified in ArrayList parameter

    public int getInt(ArrayList<Integer> options, String typeErrorMessage, String valueErrorMessage) {
        while(true) {
            Integer value = (getInt(typeErrorMessage));
            if(options.contains(value)) return value;
            else System.out.print(valueErrorMessage);
        }
    }

    // int input - only accepting ints specified in Array parameter

    public int getInt(int[] options, String typeErrorMessage, String valueErrorMessage) {
        while(true) {
            int value = (getInt(typeErrorMessage));
            for(int opt : options) {
                if(opt == value) return value;
            }
            System.out.print(valueErrorMessage);
        }
    }
}
