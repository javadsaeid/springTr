package com.saeid.ls1.customer;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("customerReop")
public class CustomerJPADataAccessService implements CustomerDAO {
    private final CustomerRepository customerRepository;

    public CustomerJPADataAccessService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customerRepository.findById(id.longValue());
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(Integer id) {
        customerRepository.deleteCustomerById(id.longValue());
    }

    @Override
    public boolean existsPersonWithEmail(String email) {
        return customerRepository.existsCustomerByEmail(email);
    }
}
