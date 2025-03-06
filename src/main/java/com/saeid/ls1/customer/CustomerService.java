package com.saeid.ls1.customer;

import com.saeid.ls1.exceptions.DuplicationResourceException;
import com.saeid.ls1.exceptions.ResourceNotFound;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {
    private final CustomerJPADataAccessService customerDataAccessService;

    public CustomerService(CustomerJPADataAccessService customerDataAccessService) {
        this.customerDataAccessService = customerDataAccessService;
    }

    public List<Customer> getAllCustomers() {
        return customerDataAccessService.selectAllCustomers();
    }

    public Customer getCustomerById(int id) {
        return customerDataAccessService.selectCustomerById(id)
                .orElseThrow(() -> new ResourceNotFound("Customer with id " + id + " not found"));
    }

    public void addCustomer(CustomerDTO customerRegistrationRequest) {
        if (customerDataAccessService.existsPersonWithEmail(customerRegistrationRequest.email())) {
            throw new DuplicationResourceException("Customer with email " + customerRegistrationRequest.email() + " already exists");
        }

        Customer customer = new Customer();
        customer.setName(customerRegistrationRequest.name());
        customer.setEmail(customerRegistrationRequest.email());
        customer.setActive(customerRegistrationRequest.active());

        customerDataAccessService.insertCustomer(customer);
    }

    public void removeCustomer(Integer customerId) {
        customerDataAccessService.deleteCustomerById(customerId);
    }
}
