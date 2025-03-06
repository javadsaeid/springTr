package com.saeid.ls1.person;

import com.saeid.ls1.enums.Gender;
import jakarta.validation.constraints.NotEmpty;

public record PersonDTO(
        @NotEmpty(message = "FirstName Could Not Be Empty.")
        String firstName,
        String lastName,
        int age,
        Gender gender
) {}
