package PhoneBook;

import java.util.ArrayList;

public class Contact {
    private String name;
    private ArrayList<String> phoneNumber;
    private String street;
    private String city;
    public Contact(String name){
        this.name = name;
        this.phoneNumber = new ArrayList<>();
        this.city = null;
        this.street = null;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public void removeInfo(){
        this.city = null;
        this.street = null;
        this.phoneNumber.clear();
    }

    public void setAddress(String city, String street){
        this.city = city;
        this.street = street;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }
}
