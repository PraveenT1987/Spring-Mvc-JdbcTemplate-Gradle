package com.practice.dao;

import com.practice.bean.Customer;

import java.util.List;

/**
 * Created by ravikiran_gorthi on 5/8/17.
 */
public interface CustomerDao {

    public void saveOrUpdate(Customer customer);

    public void deleteCustomer(int customerId);

    public Customer getCustomer(int customerId);

    public List<Customer> listCustomer();

    public boolean isCustomerDeleted();

    public boolean isCustomerUpdated();

}
