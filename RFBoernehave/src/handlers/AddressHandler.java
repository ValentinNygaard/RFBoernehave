package handlers;

import menu.UserDialog;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressHandler {

    private List<Address> addressList = new ArrayList<Address>();
    InputHandler input = new InputHandler();

    private static AddressHandler instance;

    private AddressHandler(){
        initAddressList();
    }

    public static AddressHandler getAddressHandler(){
        if(instance == null){
            AddressHandler ah = new AddressHandler();
            instance = ah;
        }
        return instance;
    }

    private void initAddressList() {
        FileHandling fileHandling = new FileHandling();
        Scanner input = new Scanner(fileHandling.readFile("data/addressList.txt"));
        while (input.hasNextLine())
        {
            String fileLine = input.nextLine();
            String[] components = fileLine.split(",");
            int addressID = Integer.parseInt(components[0]);
            int postalCode = Integer.parseInt(components[3]) ;
            addressList.add(new Address(addressID,components[1],components[2],postalCode,components[4],components[5]));
        }
    }

    public void saveAddressList() {
        FileHandling fileHandling = new FileHandling();
        StringBuilder sb = new StringBuilder();
        for (Address address : addressList) {
            sb.append(address.fileToString());
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        fileHandling.writeFile(sb.toString(),"data/addressList.txt");
    }

    public void addAddress(int addressID, String streetName, String streetNumber, int postalCode, String city, String country) {
        addressList.add(new Address(addressID,streetName,streetNumber,postalCode,city,country));
       // saveAddressList(); kan implementeres
    }

    public Address userCreate() {
        UserDialog input = new UserDialog();
        int addressID = addressList.get(addressList.size()-1).getAddressID()+1;
        String streetName = input.getStreetName();
        String streetNumber = input.getStreetNumber();
        int postalCode = input.getPostalCode();
        String city = input.getCity();
        String country = input.getCountry();
        addressList.add(new Address(addressID,streetName,streetNumber,postalCode,city,country));
        return addressList.get(addressList.size()-1);
    }


    public boolean deleteAddress(int addressID) {
        boolean delete = false;
        for (Address a: addressList){
            if (a.getAddressID() == addressID){
                addressList.remove(addressList.indexOf(a));
                return true;
            }
        }
        return false;
    }

    public Address getAddressByID(int addressID) {
        Address address = null;
        for (Address a: addressList){
            if (a.getAddressID() == addressID){
                address = a;
                return address;
            }
        }
        return address;
    }

    public void printList()
    {
        for(Address a : addressList)
        {
            System.out.println(a.fileToString());
        }
    }

    public void updateParentAddress(){
        System.out.println("Skriv ny adresse");
        System.out.println("Start med id");
        AddressHandler ah = AddressHandler.getAddressHandler();
        int adresseID = input.getInt("skriv tal");
        Address address = ah.getAddressByID(adresseID); // finder adressen med det id
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
    }

}
