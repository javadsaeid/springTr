package com.saeid.ls1.person;

import com.saeid.ls1.exceptions.ResourceNotFound;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonJPADataAccessService personJPADataAccessService;

    public PersonService(PersonJPADataAccessService personJPADataAccessService) {
        this.personJPADataAccessService = personJPADataAccessService;
    }

    public List<Person> getAllPersons() {
        return personJPADataAccessService.findAll();
    }

    public Optional<Person> getPersonById(long id) {
        return personJPADataAccessService.findById(id);
    }

    public void add(PersonDTO pr) {
        Person person = new Person();
        person.setAge(pr.age());
        person.setFirstName(pr.firstName());
        person.setLastName(pr.lastName());
        personJPADataAccessService.save(person);
    }

    public void remove(long id) {
        personJPADataAccessService.deleteById(id);
    }

    public void update(Long id, PersonDTO request) {
        getPersonById(id).ifPresent(person -> {
            person.setAge(request.age());
            person.setFirstName(request.firstName());
            person.setLastName(request.lastName());
            personJPADataAccessService.save(person);
        });

        throw new ResourceNotFound("Person with id " + id + " not found");
    }
}
