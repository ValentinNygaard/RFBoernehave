package handlers;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressHandler {

    public List<Address> addressList = new ArrayList<Address>();

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
        Scanner input = new Scanner(FileHandling.readFile("data/addressList.txt"));
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
        StringBuilder sb = new StringBuilder();
        for (Address address : addressList) {
            sb.append(address.fileToString());
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        FileHandling.writeFile(sb.toString(),"data/addressList.txt");
    }

    public void addAddress(int addressID, String streetName, String streetNumber, int postalCode, String city, String country) {
        addressList.add(new Address(addressID,streetName,streetNumber,postalCode,city,country));
       // saveAddressList(); kan implementeres
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
}
