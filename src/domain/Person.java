package domain;

public class Person {

    private String fullName;
    private String phoneNumber;
    private String eMail;

    public Person(String fullName, String phoneNumber, String eMail) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String toString(){
        return "Full name:" + fullName + ", Phone Number:" + phoneNumber + ", eMail:" + eMail;
    }
}
