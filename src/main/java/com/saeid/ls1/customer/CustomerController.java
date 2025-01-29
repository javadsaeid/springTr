package com.saeid.ls1.customer;

import com.saeid.ls1.exceptions.ResourceNotFound;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("{customerId}")
    public Customer getCustomer(@PathVariable Integer customerId) {
        return customerService.getCustomerById(customerId)
                .orElseThrow(() -> new ResourceNotFound("Customer with id " + customerId + " not found"));
    }

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        customerService.addCustomer(customerRegistrationRequest);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable Integer customerId) {
        customerService.removeCustomer(customerId);
    }

}
