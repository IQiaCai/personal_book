package com.itdou.controller;


import com.itdou.domain.Person;
import com.itdou.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public boolean save(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping
    public boolean update(@RequestBody Person person) {
        return personService.update(person);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return personService.delete(id);
    }

    @GetMapping
    public List<Person> getAll() {
        List<Person> persons = personService.getAll();
        return personService.getAll();
    }
}
