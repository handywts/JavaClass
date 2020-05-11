package sample;

public class Contact {

    private String firstName;
    private String middleName;
    private String lastName;

    private String phoneNumber;

    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipCode;

    private String picturePath;

    private String note;

    public Contact(){
        this.firstName = null;
        this.middleName = null;
        this.lastName = null;
        this.phoneNumber = null;
        this.street1 = null;
        this.street2 = null;
        this.city = null;
        this.state = null;
        this.zipCode = null;
        this.picturePath = "pictures/Portrait_Placeholder.png";
        this.note = null;
    }

    public Contact(String firstName) {
        this();
        this.firstName = firstName;
    }
    public Contact(String firstName, String middleName) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;

    }
    public Contact(String firstName, String middleName, String lastName) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

    }
    public Contact(String firstName, String middleName, String lastName, String phoneNumber) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    public Contact(String firstName, String middleName, String lastName, String phoneNumber, String street1) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.street1 = street1;

    }
    public Contact(String firstName, String middleName, String lastName, String phoneNumber, String street1, String street2) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.street1 = street1;
        this.street2 = street2;

    }
    public Contact(String firstName, String middleName, String lastName, String phoneNumber, String street1, String street2, String city) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;

    }
    public Contact(String firstName, String middleName, String lastName, String phoneNumber, String street1, String street2, String city, String state) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
    }
    public Contact(String firstName, String middleName, String lastName, String phoneNumber, String street1, String street2, String city, String state, String zipCode) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

    }
    public Contact(String firstName, String middleName, String lastName, String phoneNumber, String street1, String street2, String city, String state, String zipCode, String picturePath) {
        this();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.picturePath = picturePath;

    }

    public Contact(String firstName, String middleName, String lastName, String phoneNumber, String street1, String street2, String city, String state, String zipCode, String picturePath, String note) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.picturePath = picturePath;
        this.note = note;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getAddress() {
        if(street2 != null) {
            return (street1 + ";  " + street2);
        }else{
            return(street1);
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    //Create method that will combine names together for use in Listview.


}
