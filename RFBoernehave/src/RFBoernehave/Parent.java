

package RFBoernehave;

public class Parent {

    private int parentId;
    private Address parentAddress;
    private int telephoneNumber;
    private boolean isAddressParent;
    private boolean isCustodyParent;

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

}
