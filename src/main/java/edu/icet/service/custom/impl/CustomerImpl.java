package edu.icet.service.custom.impl;

import edu.icet.dto.custom.Customer;
import edu.icet.service.custom.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerImpl implements CustomerService {
    ArrayList<Customer> customerList;

    public CustomerImpl() {
        customerList=new ArrayList<>();
        customerList.add(new Customer("C001","Saman","Galgamuwa",75000.00));
        customerList.add(new Customer("C002","Anura","galnewa",77000.00));
        customerList.add(new Customer("C003","Wimal","Gonagamuwa",72000.00));
    }

    @Override
    public List<Customer> getAll() {

        return this.customerList;

    }

    @Override
    public Customer search(String s) {
        return null;
    }
}
