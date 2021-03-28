package com.Amalitech;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
   public static Contact createContact(String personName, String phoneNumber){
        Contact newContact = new Contact(personName,phoneNumber);
        return newContact;
   }

}
