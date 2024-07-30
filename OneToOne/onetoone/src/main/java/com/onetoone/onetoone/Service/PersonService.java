package com.onetoone.onetoone.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoone.onetoone.Entity.Person;
import com.onetoone.onetoone.Repository.PersonRepository;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(Person person){
        return personRepository.save(person);
    }

    public Person retrievePersonByPassportId(String passportId){
        return personRepository.findByPassportId(passportId);
    }

    public Person updatePerson(Person person){
        return personRepository.save(person);
    }

    public void deletePerson(String passportId){
        Person person = personRepository.findByPassportId(passportId);
        personRepository.delete(person);
    }
}