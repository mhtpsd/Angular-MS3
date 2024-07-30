package com.onetoone.onetoone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.onetoone.Entity.Person;
import com.onetoone.onetoone.Repository.PersonRepository;
import com.onetoone.onetoone.Service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person createdPerson = personService.createPerson(person);
        return ResponseEntity.ok(createdPerson);
    }

    @GetMapping("/{passportId}")
    public ResponseEntity<Person> getPersonByPassportId(@PathVariable String passportId) {
        Person person = personService.retrievePersonByPassportId(passportId);
        if (person == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(person);
    }

    @PutMapping
    public ResponseEntity<Person> updatePerson(@RequestBody Person person) {
        Person updatedPerson = personService.updatePerson(person);
        return ResponseEntity.ok(updatedPerson);
    }

    @DeleteMapping("/{passportId}")
    public ResponseEntity<Void> deletePerson(@PathVariable String passportId) {
        personService.deletePerson(passportId);
        return ResponseEntity.noContent().build();
    }
}