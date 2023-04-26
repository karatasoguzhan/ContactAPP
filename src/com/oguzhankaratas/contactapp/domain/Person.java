package com.oguzhankaratas.contactapp.domain;

import java.util.Objects;

public class Person {

    private int id;
    private String fullName;
    private String phoneNumber;
    private String email;
    private static int idCounter = 1;

    public Person(int id, String fullName, String phoneNumber, String eMail) {
        this.fullName = fullName;
        this.email = eMail;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public Person(String fullName, String phoneNumber, String eMail) {
        this.fullName = fullName;
        this.email = eMail;
        this.phoneNumber = phoneNumber;
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, email);
    }
}
