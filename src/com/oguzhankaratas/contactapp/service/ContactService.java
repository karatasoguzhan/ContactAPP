package com.oguzhankaratas.contactapp.service;

import com.oguzhankaratas.contactapp.dal.dao.ContactInMemoryDataAccessObject;
import com.oguzhankaratas.contactapp.domain.Person;

import java.util.ArrayList;

public class ContactService {
    private final ContactInMemoryDataAccessObject contactInMemoryDataAccessObject;

    public ContactService(ContactInMemoryDataAccessObject contactInMemoryDataAccessObject) {
        this.contactInMemoryDataAccessObject = contactInMemoryDataAccessObject;
    }
    public void addPerson(Person person){
        contactInMemoryDataAccessObject.addPerson(person);
    }
    public void printAll(){
        contactInMemoryDataAccessObject.printAll();
    }

    public ArrayList<Person> findPersonByName(String name){
        ArrayList<Person> personByName = contactInMemoryDataAccessObject.findPersonByName(name);
        return personByName;
    }
    public void removePerson(Person person){
        contactInMemoryDataAccessObject.removePerson(person);
    }
    public Person deletePerson(Person person){
        return contactInMemoryDataAccessObject.deletePerson(person);
    }
    public Person updatePerson(Person person,int id){
        Person person1 = contactInMemoryDataAccessObject.updatePerson(person, id);
        return person1;
    }
}
