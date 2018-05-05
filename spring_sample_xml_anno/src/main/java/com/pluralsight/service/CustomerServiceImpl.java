/**
 * 
 */
package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

/**
 * @author arka.a.bhattacharya
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	/*Member level Autowiring
	 * @Autowired
	private CustomerRepository customerRepository;*/
	
	
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Constructor injection");
		this.customerRepository= customerRepository;
	}
	
	/*
	 * Setter injection autowiring	 
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}
	*/

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
