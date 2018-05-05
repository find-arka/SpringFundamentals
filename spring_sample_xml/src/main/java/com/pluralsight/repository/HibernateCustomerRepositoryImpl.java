/**
 * 
 */
package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.pluralsight.model.Customer;

/**
 * @author arka.a.bhattacharya
 *
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername;

	/*public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}*/ //used with xml based property 

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.repository.HibernateCustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		System.out.println("Testing properties: "+dbUsername);
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstname("Arka");
		customer.setLastname("Bhattacharya");

		customers.add(customer);
		return customers;
	}

}
