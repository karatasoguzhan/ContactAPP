package com.oguzhankaratas.contactapp.dal.dao;

import com.oguzhankaratas.contactapp.dal.ContactDataAccessLayer;
import com.oguzhankaratas.contactapp.domain.Person;
import com.oguzhankaratas.contactapp.util.DBDataSource;

import java.sql.*;
import java.util.ArrayList;

public class ContactDatabaseDAO implements ContactDataAccessLayer {

    public static final String INSERT_CONTACT_SQL_FORMAT = "INSERT INTO t_contacts VALUES (%d,'%s','%s','%s')";

    @Override
    public void addPerson(Person newPerson) {
        String query = String.format(INSERT_CONTACT_SQL_FORMAT,newPerson.getId(),newPerson.getFullName(),newPerson.getPhoneNumber(),newPerson.getEmail());
        try(Connection connect = DBDataSource.connect();
            Statement statement = connect.createStatement()) {
           boolean execute = statement.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printAll() {
        try {
            Connection connect = DBDataSource.connect();
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM t_contacts");
            while (resultSet.next()){
                int contactId = resultSet.getInt("contact_id");
                String fullName = resultSet.getString("full_name");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                System.out.println("Contacts ->" + " Contact id " + contactId + " fullname " + fullName + " phonenumber " + phoneNumber + " email " + email);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public ArrayList<Person> findPersonByName(String name) {
        ArrayList<Person> personList = new ArrayList<>();
        try {
            Connection connect = DBDataSource.connect();
            PreparedStatement preparedStatement = connect.prepareStatement("SELECT * FROM t_contacts WHERE full_name = ?");
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int contactId = resultSet.getInt("contact_id");
                String fullName = resultSet.getString("full_name");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                Person person = new Person(contactId, fullName, phoneNumber, email);
                personList.add(person);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return personList;
    }

    @Override
    public void removePerson(Person person) {
        this.deletePerson(person);

    }

    @Override
    public Person deletePerson(Person personWillBeDeleted) {
        String query = "DELETE FROM t_contacts WHERE contact_id = ?";
        boolean result = false;
        try(Connection connect = DBDataSource.connect();
            PreparedStatement preparedStatement = connect.prepareStatement(query)){
            preparedStatement.setInt(1,personWillBeDeleted.getId());
            result = preparedStatement.execute(); //bakılacak
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result ? personWillBeDeleted : null;
    }

    @Override
    public Person updatePerson(Person person, int id) {
        String query = "UPDATE t_contacts SET full_name = ?, phone_number = ?, email = ? WHERE contact_id = ?";
        try(Connection connect = DBDataSource.connect();
            PreparedStatement preparedStatement = connect.prepareStatement(query)){
            preparedStatement.setString(1,person.getFullName());
            preparedStatement.setString(2,person.getPhoneNumber());
            preparedStatement.setString(3,person.getEmail());
            preparedStatement.setInt(4,id);
            boolean execute = preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return person; //verilen varsa güncelliyip dönecek yoksa null
    }
}
