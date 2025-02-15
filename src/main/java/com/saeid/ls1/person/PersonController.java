package com.saeid.ls1.person;

import com.saeid.ls1.exceptions.ResourceNotFound;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping
    public void createPerson(@RequestBody PersonRegisterRequest person) throws ResourceNotFound {
        personService.add(person);
    }

    @GetMapping("{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id).orElseThrow(() -> new ResourceNotFound("Person with id:" + id + " not found."));
    }

    @PutMapping("{id}")
    public void updatePerson(@PathVariable Long id, @RequestBody PersonRegisterRequest request) {
        personService.update(id, request);
    }

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.remove(id);
    }

}
