package com.Amalitech;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contact)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact newContact){
        int checkContact = findContact(newContact.getName());
        if (checkContact >= 0){
            return false;
        }
        myContacts.add(newContact);
        return true;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int checkContact = findContact(oldContact);
        if (checkContact >= 0){
            myContacts.set(checkContact,newContact);
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact){
        int checkContact = findContact(contact);
        if (checkContact >= 0){
            myContacts.remove(checkContact);
            return true;
        }
        return false;
    }
    public Contact queryContact(String contact){
        int checkContact = findContact(contact);
        if (checkContact>=0){
            return myContacts.get(checkContact);
        }
        return null;

    }
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println( (i+1) + ". " + myContacts.get(i).getName() + " -> "
                    + myContacts.get(i).getPhoneNumber());
        }
    }

}
