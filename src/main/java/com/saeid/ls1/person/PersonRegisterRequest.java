package com.saeid.ls1.person;

public record PersonRegisterRequest(
        String firstName,
        String lastName,
        int age
) {}
