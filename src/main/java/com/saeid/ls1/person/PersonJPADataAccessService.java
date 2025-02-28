package com.saeid.ls1.person;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository("personRepo")
public class PersonJPADataAccessService implements PersonDAO {
    private final PersonRepository personRepository;

    public PersonJPADataAccessService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
