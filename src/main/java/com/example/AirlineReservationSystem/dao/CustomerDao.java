package com.example.AirlineReservationSystem.dao;

import com.example.AirlineReservationSystem.model.Customer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerDao {

    int insertCustomer(UUID id, Customer customer);

    default int insertCustomer(Customer customer) {
        UUID id = UUID.randomUUID();
        return insertCustomer(id, customer);
    }

    List<Customer> selectAllCustomer();

    Optional<Customer> selectCustomerById(UUID id);

    int deleteCustomerById(UUID id);

    int updateCustomerById(UUID id, Customer customer);
}
