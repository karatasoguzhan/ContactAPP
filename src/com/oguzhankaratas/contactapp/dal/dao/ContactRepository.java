package com.oguzhankaratas.contactapp.dal.dao;

import com.oguzhankaratas.contactapp.dal.ContactDataAccessLayer;
import com.oguzhankaratas.contactapp.domain.Person;

import java.util.ArrayList;

public class ContactRepository implements ContactDataAccessLayer {
    @Override
    public void addPerson(Person newPerson) {

    }

    @Override
    public void printAll() {

    }

    @Override
    public ArrayList<Person> findPersonByName(String name) {
        return null;
    }

    @Override
    public void removePerson(Person person) {

    }

    @Override
    public Person deletePerson(Person personWillBeDeleted) {
        return null;
    }

    @Override
    public Person updatePerson(Person person, int id) {
        return null;
    }
}
