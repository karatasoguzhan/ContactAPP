package com.oguzhankaratas.contactapp.driver;

import com.oguzhankaratas.contactapp.domain.ContactHardDiscDAO;
import com.oguzhankaratas.contactapp.domain.ContactInMemoryDataAccessObject;
import com.oguzhankaratas.contactapp.domain.Person;
import com.oguzhankaratas.contactapp.service.ContactService;

public class DriverPhone {
    public static void main(String[] args) {
        Person person = new Person("oğuzhan karataş","5354322832","oguzhan.krts@hotmail.com");
        Person person2 = new Person("İkram Dağcı","5385946463","ikram.dgc@hotmail.com");
        Person person3 = new Person("Recep Çınar","5555711762","e.recepcınar@hotmail.com");
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
        contactHardDiscDAO.removePerson(person3);

    }
    public static void test(){

        String line ="Person{id=1, fullName='oğuzhan karataş', phoneNumber='5354322832', email='oguzhan.krts@hotmail.com'}";

    }

}
