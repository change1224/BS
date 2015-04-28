package com.oracle.cms.model;

import java.util.LinkedList;
import java.util.List;

import com.oracle.cms.domain.Customer;

public class CustomerService {
	private static CustomerService customerSvc = new CustomerService();
	private List<Customer> customers;
	
	private CustomerService() {
		
	}
	
	public CustomerService getCustomerSvc() {
		return getCustomerSvc();
	}
	
	public List<Customer> getAllCustomers() {
		customers = new LinkedList<Customer>();
		customers.add(new Customer("卢佳", "男", "小超人", 33));
		customers.add(new Customer("马玥", "男", "大超人", 21));
		customers.add(new Customer("王建勇", "男", "钢铁侠", 26));
		return customers;
	}
	
	
	
	
}
