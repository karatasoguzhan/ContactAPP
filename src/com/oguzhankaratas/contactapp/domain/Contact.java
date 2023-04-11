package com.oguzhankaratas.contactapp.domain;

import java.util.ArrayList;

public class Contact {

    private ArrayList<Person> people;

    public Contact() {
        this.people = new ArrayList<Person>();

    }

    public void addPerson(Person newPerson) {
        people.add(newPerson);
    }

    public void printAll() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }

    public ArrayList<Person> findPersonByName(String name) {
        ArrayList<Person> personList = new ArrayList<>();
        for (Person person : people) {
            if (person.getFullName().contains(name)) {
                personList.add(person);
            }
        }
        return personList;
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public Person deletePerson(Person personWillBeDeleted) {
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if (person.getFullName().equals(personWillBeDeleted.getFullName())
                    && person.getEmail().equals(personWillBeDeleted.getEmail())
                    && person.getPhoneNumber().equals(personWillBeDeleted.getPhoneNumber())) {
                people.remove(i);
                return person;
            }
        }
        return null;
    }

    public Person updatePerson(Person person, int id) {
        for (int i = 0; i < people.size(); i++) {
            Person person1 = people.get(i);
            if (person1.getId() == id) {
                //people.set(i,person);
                person1.setFullName(person.getFullName());
                person1.setEmail(person.getEmail());
                person1.setPhoneNumber(person.getPhoneNumber());
                return person1;
            }
        }
        return null;
    }
}





