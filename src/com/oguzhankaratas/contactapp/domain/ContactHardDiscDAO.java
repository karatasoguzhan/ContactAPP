package com.oguzhankaratas.contactapp.domain;

import java.io.*;
import java.util.ArrayList;

public class ContactHardDiscDAO implements ContactDataAccessLayer{

   @Override
    public void addPerson(Person person){
        File file = new File("contacts.txt");
        try(FileOutputStream fileOutputStream = new FileOutputStream(file,true)) {
            String data = person.toString()+"\n";
            byte[] bytes=data.getBytes();
            fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
   @Override
    public void printAll(){
       try(BufferedReader reader =new BufferedReader( new FileReader("contacts.txt"))) {
           String line;
           while ((line=reader.readLine()) != null){
               System.out.println(line);
           }
       } catch (IOException e) {
           System.out.println("Any person can not found!");
       }
   }

    @Override
    public ArrayList<Person> findPersonByName(String name) {
        ArrayList<Person> personList = new ArrayList<>();
        try(BufferedReader reader =new BufferedReader( new FileReader("contacts.txt"))) {
            String line;
            while ((line=reader.readLine()) != null){

               // Person person = new Person();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }

    @Override
    public void removePerson(Person person) {
        try(BufferedReader reader = new BufferedReader(new FileReader("contacts.txt"))) {
            String line;
            String newData="";
            String data = person.toString();
            while((line=reader.readLine())!=null){
                if (!line.contains(data)){
                    newData+= line+"\n";
                }
            }
            FileWriter writer =new FileWriter("contacts.txt");
            writer.write(newData);
            writer.close();

       } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public Person deletePerson(Person personWillBeDeleted) {
        return null;
    }

    @Override
    public Person updatePerson(Person person, int id) {

        return null;
    }
}
