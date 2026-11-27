package com.example.module07.service;

import com.example.module07.dao.CustomerDao;
import com.example.module07.dao.impl.CustomerDaoImpl;
import com.example.module07.model.Customer;
import javafx.collections.ObservableList;

public class CustomerService {
    private final CustomerDao customerDao = new CustomerDaoImpl();

    public void addCustomer(Customer customer) {
        validateCustomer(customer);
        customerDao.addCustomer(customer);
    }

    public ObservableList<Customer> findAllCustomers() {
        return customerDao.findAllCustomer();
    }

    public void updateCustomer(Customer customer) {
        validateCustomer(customer);
        customerDao.updateCustomer(customer);
    }

    public void deleteCustomer(int customerId) {
        customerDao.deleteCustomer(customerId);
    }

    private void validateCustomer(Customer customer) {
        if (customer.getName() == null || customer.getName().isBlank() ||
                customer.getEmail() == null || customer.getEmail().isBlank() ||
                customer.getPhone() == null || customer.getPhone().isBlank()) {
            throw new IllegalArgumentException("All customer fields must be filled");
        }
    }
}
