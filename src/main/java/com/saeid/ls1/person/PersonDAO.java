package com.saeid.ls1.person;

import java.util.List;
import java.util.Optional;

public interface PersonDAO {
    List<Person> findAll();
    Optional<Person> findById(Long id);
    Person save(Person person);
    void deleteById(Long id);
}
