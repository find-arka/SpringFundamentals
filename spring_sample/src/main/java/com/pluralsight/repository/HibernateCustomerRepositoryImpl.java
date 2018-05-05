/**
 * 
 */
package com.pluralsight.repository;


import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

/**
 * @author arka.a.bhattacharya
 *
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.HibernateCustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Arka");
		customer.setLastname("Bhattacharya");
		
		customers.add(customer);
		return customers;				
	}

}
