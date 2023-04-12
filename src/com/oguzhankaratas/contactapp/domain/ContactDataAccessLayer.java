package com.oguzhankaratas.contactapp.domain;

import java.util.ArrayList;

public interface ContactDataAccessLayer {
    void addPerson(Person newPerson);

    void printAll();

    ArrayList<Person> findPersonByName(String name);

    void removePerson(Person person);

    Person deletePerson(Person personWillBeDeleted);

    Person updatePerson(Person person, int id);

}
