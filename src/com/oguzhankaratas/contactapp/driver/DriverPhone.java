package com.oguzhankaratas.contactapp.driver;

import com.oguzhankaratas.contactapp.domain.Contact;
import com.oguzhankaratas.contactapp.domain.Person;
import com.oguzhankaratas.contactapp.service.ContactService;

public class DriverPhone {
    public static void main(String[] args) {
        Person person = new Person("oğuzhan karataş","5354322832","oguzhan.krts@hotmail.com");
        Person person2 = new Person("İkram Dağcı","5385946463","ikram.dgc@hotmail.com");
        Person person3 = new Person("İkram Dağcı","5385946463","ikram.dgc@hotmail.com");
        //String x = person.toString();
        //System.out.println(x);
        Contact contact = new Contact();
        ContactService contactService = new ContactService(contact);
        contactService.addPerson(person);
        contactService.addPerson(person2);
        //contact.addPerson(person3);
        contact.printAll();
        contact.removePerson(person3);
        contact.printAll();

    }
}
