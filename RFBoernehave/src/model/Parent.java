package model;

public class Parent extends Person{

    private int parentId;
    private Address parentAddress;
    private int telephoneNumber;
    private boolean isAddressParent;
    private boolean isCustodyParent;

    public Parent(int personId, int cprNumber, String firstName, String lastName, int parentId, Address parentAddress, int telephoneNumber, boolean isAddressParent, boolean isCustodyParent) {
        super(personId, cprNumber, firstName, lastName);
        this.parentId = parentId;
        this.parentAddress = parentAddress;
        this.telephoneNumber = telephoneNumber;
        this.isAddressParent = isAddressParent;
        this.isCustodyParent = isCustodyParent;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Address getParentAddress() {
        return parentAddress;
    }

    public void setParentAddress(Address parentAddress) {
        this.parentAddress = parentAddress;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public boolean isAddressParent() {
        return isAddressParent;
    }

    public void setAddressParent(boolean addressParent) {
        isAddressParent = addressParent;
    }

    public boolean isCustodyParent() {
        return isCustodyParent;
    }

    public void setCustodyParent(boolean custodyParent) {
        isCustodyParent = custodyParent;
    }

    public String fileToString(){
        return super.getPersonId()+ "," +super.getCprNumber()+"," +super.getFirstName()+"," +super.getLastName()+"," +parentId+"," +parentAddress.getAddressID()+","+telephoneNumber+","+isAddressParent+","+isCustodyParent;
        }

}
