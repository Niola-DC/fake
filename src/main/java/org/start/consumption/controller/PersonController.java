package org.start.consumption.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.start.consumption.entity.Person;
import org.start.consumption.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/person")
@CrossOrigin("*")
public class PersonController {

    @Autowired
    PersonService ps;

    @GetMapping("/all")
    public List<Person> getAllPersons(){
        return ps.allPersons();
    }

    @PostMapping("/add")
    public String addPerson(@RequestParam String name, String email){
        ps.addPersons(name, email);
        return "person added";
    }
}
