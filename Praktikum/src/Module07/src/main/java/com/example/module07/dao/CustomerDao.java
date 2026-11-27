package com.example.module07.dao;

import com.example.module07.model.Customer;
import javafx.collections.ObservableList;

public interface CustomerDao {
    ObservableList<Customer> findAllCustomers();

    void addCustomer(Customer customer);
    ObservableList<Customer> findAllCustomer();
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}