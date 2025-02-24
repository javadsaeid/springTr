package com.saeid.ls1.person;

import jakarta.validation.constraints.NotEmpty;

public record PersonDTO(
        @NotEmpty(message = "FirstName Could Not Be Empty.")
        String firstName,
        String lastName,
        int age
) {}
