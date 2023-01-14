package PhoneBook;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts;

    public PhoneBook(){
        this.contacts = new ArrayList<>();
    }

     public void remove(String name){
        Contact contact = findContact(name, true);
         if(contact == null) return;
         contact.removeInfo();
     }

    public void addContact(Contact contact){
        this.contacts.add(contact);
    }

    public ArrayList<String> getPhone(String name){
        Contact contact = findContact(name, true);
        if(contact == null) return null;
        return contact.getPhoneNumber();
    }
    public String getName(String phoneNumber){
        Contact contact = findContact(phoneNumber, false);
        if(contact == null) return null;
        return contact.getName();
    }

    public String getPersonalInfo(String name){
        Contact contact = findContact(name, true);
        if(contact == null) return null;
        return "Address: " + contact.getStreet() + " " + contact.getCity() + "\n" + "Phone Numbers: \n" + contact.getPhoneNumber().toString();
    }

    private Contact findContact(String string, boolean isName){
        for(Contact contact : this.contacts){
            if(isName && contact.getName().equals(string)){
                return contact;
            } else if(!isName && contact.getPhoneNumber().contains(string)){
                return contact;
            }
        }
        return null;
    }


}
