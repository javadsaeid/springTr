package com.saeid.ls1.customer;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    void deleteCustomerById(Long id);
    boolean existsCustomerByEmail(String email);
}
