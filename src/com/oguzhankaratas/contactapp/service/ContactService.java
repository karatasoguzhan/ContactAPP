package com.oguzhankaratas.contactapp.service;

import com.oguzhankaratas.contactapp.dal.ContactDataAccessLayer;
import com.oguzhankaratas.contactapp.dal.dao.ContactInMemoryDataAccessObject;
import com.oguzhankaratas.contactapp.domain.Person;

import java.util.ArrayList;

public class ContactService {
    private final ContactDataAccessLayer contactDataAccessLayer;

    public ContactService(ContactDataAccessLayer contactDataAccessLayer) {
        this.contactDataAccessLayer = contactDataAccessLayer;
    }
    public void addPerson(Person person){
        if (person.getFullName().length()<3){
            System.out.println("Invalid fullname!!");
            return;
        }
        contactDataAccessLayer.addPerson(person);
    }
    public void printAll(){
        contactDataAccessLayer.printAll();
    }

    public ArrayList<Person> findPersonByName(String name){
        ArrayList<Person> personByName = contactDataAccessLayer.findPersonByName(name);
        return personByName;
    }
    public void removePerson(Person person){
        contactDataAccessLayer.removePerson(person);
    }
    public Person deletePerson(Person person){
        return contactDataAccessLayer.deletePerson(person);
    }
    public Person updatePerson(Person person,int id){
        Person person1 = contactDataAccessLayer.updatePerson(person, id);
        return person1;
    }
}
