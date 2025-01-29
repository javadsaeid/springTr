package com.saeid.ls1.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {
}
