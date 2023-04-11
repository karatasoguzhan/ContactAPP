package com.oguzhankaratas.contactapp.service;

import com.oguzhankaratas.contactapp.domain.Contact;
import com.oguzhankaratas.contactapp.domain.Person;

public class ContactService {
    private final Contact contact;

    public ContactService(Contact contact) {
        this.contact = contact;
    }
    public void addPerson(Person person){
        contact.addPerson(person);
    }
}
