package com.saeid.ls1.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer id);
    void insertCustomer(Customer customer);
    void deleteCustomerById(Integer id);
    boolean existsPersonWithEmail(String email);
}
