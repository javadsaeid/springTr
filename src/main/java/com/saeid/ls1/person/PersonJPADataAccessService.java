package com.saeid.ls1.person;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("personRepo")
public class PersonJPADataAccessService implements PersonDAO {
    private final PersonRepository personRepository;

    public PersonJPADataAccessService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAll() {
        return this.personRepository.findAll();
    }

    @Override
    public Optional<Person> findById(Long id) {
        return this.personRepository.findById(id);
    }

    @Override
    public Person save(Person person) {
        return this.personRepository.save(person);
    }

    @Override
    public void deleteById(Long id) {
        this.personRepository.deleteById(id);
    }
}
