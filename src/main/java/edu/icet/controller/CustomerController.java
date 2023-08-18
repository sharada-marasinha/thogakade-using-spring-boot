package edu.icet.controller;

import edu.icet.dto.custom.Customer;
import edu.icet.service.custom.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/get-customers")
    public List<Customer> getAllCustomer() {
        return customerService.getAll();

    }
    @PostMapping("/add-customer")
    public boolean addCustomer(@RequestBody Customer customer) {
        return customerService.add(customer);

    }

}
