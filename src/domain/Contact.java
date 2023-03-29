package domain;

import java.util.ArrayList;

public class Contact {

    private ArrayList<Person> people;

    public Contact() {
        this.people = new ArrayList<Person>();

    }

    public void addPerson(Person newPerson) {
       people.add(newPerson);
    }
    public void  printAll(){
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }

}


