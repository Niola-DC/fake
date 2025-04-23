package org.start.consumption.service;

import org.springframework.stereotype.Service;
import org.start.consumption.entity.Person;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    List<Person> persons = new ArrayList<>();

    public List<Person> allPersons(){
        persons.add(new Person("Chichi", "chichi@gmail.com"));
//        persons.get(1);
        return persons;
    }

    public void addPersons(String name, String email){
        persons.add(new Person(name, email));
        System.out.println("Person Added");
    }
}
