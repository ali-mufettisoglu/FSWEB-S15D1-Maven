package org.example.mobile;

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

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Contact contact = (Contact) obj;
        return this.name.equals(contact.name) && this.phoneNumber.equals(contact.phoneNumber);
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name,phoneNumber);
    }
}
