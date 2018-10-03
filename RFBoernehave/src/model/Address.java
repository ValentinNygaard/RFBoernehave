package model;

public class Address {

    private int addressID;
    private String streetName;
    private String streetNumber;
    private int postalCode;
    private String city;
    private String country;

    public Address(int addressID, String streetName, String streetNumber, int postalCode, String city, String country) {
        this.addressID = addressID;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public void setAddress(int addressID, String streetName, String streetNumber, int postalCode, String city, String country){
        this.addressID = addressID;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /*@Override
    public String toString() {
        return "Address{" +
                "addressID=" + addressID +
                ", streetName='" + streetName +
                ", streetNumber=" + streetNumber +
                ", postalCode=" + postalCode +
                ", city='" + city  +
                ", country='" + country  +
                '}';
    }*/

    public String fileToString(){
       return addressID+ "," +streetName+"," +streetNumber+"," +postalCode+"," +city+"," +country;
    }
}
