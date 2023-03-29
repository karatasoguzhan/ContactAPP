package driver;

import domain.Contact;
import domain.Person;

public class DriverPhone {
    public static void main(String[] args) {
        Person person = new Person("oğuzhan karataş","5354322832","oguzhan.krts@hotmail.com");
        Person person2 = new Person("İkram Dağcı","5385946463","ikram.dgc@hotmail.com");
        //String x = person.toString();
        //System.out.println(x);
        Contact contact = new Contact();
        contact.addPerson(person);
        contact.addPerson(person2);
        contact.printAll();

    }
}
