package com.oguzhankaratas.contactapp;

import com.oguzhankaratas.contactapp.dal.dao.ContactHardDiscDAO;
import com.oguzhankaratas.contactapp.dal.dao.ContactInMemoryDataAccessObject;
import com.oguzhankaratas.contactapp.domain.Person;
import com.oguzhankaratas.contactapp.service.ContactService;

import java.util.ArrayList;

public class DriverContactApp {
    public static void main(String[] args) {
        Person person = new Person("oğuzhan karataş", "5354322832", "oguzhan.krts@hotmail.com");
        Person person2 = new Person("İkram Dağcı", "5385946463", "ikram.dgc@hotmail.com");
        Person person3 = new Person("Recep Çınar", "5555711762", "e.recepcınar@hotmail.com");
        //String x = person.toString();
        //System.out.println(x);
        ContactInMemoryDataAccessObject contactInMemoryDataAccessObject = new ContactInMemoryDataAccessObject();
        ContactService contactService = new ContactService(contactInMemoryDataAccessObject);
        //contactService.addPerson(person);
        //contactService.addPerson(person2);
        //contact.addPerson(person3);
        //contactService.printAll();
        //contactService.removePerson(person3);
        //contactService.printAll();
        ContactHardDiscDAO contactHardDiscDAO = new ContactHardDiscDAO();
        //contactHardDiscDAO.addPerson(person3);
        //contactHardDiscDAO.printAll();
        //contactHardDiscDAO.addPerson(person);
        //contactHardDiscDAO.addPerson(person2);
        //ArrayList<Person> personByName = contactHardDiscDAO.findPersonByName("Oğuz");
        contactHardDiscDAO.updatePerson(person3, 2);
    }

}
