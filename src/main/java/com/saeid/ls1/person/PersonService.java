package com.saeid.ls1.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonJPADataAccessService personJPADataAccessService;

    public PersonService(PersonJPADataAccessService personJPADataAccessService) {
        this.personJPADataAccessService = personJPADataAccessService;
    }

    public List<Person> getAllPersons() {
        return this.personJPADataAccessService.findAll();
    }
}
