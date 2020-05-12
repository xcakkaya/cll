package com.ittr.cll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.ittr.cll.model.Customers;
import com.ittr.cll.repository.CustomersRepository;

@Service
public class CustomersService {
	
	@Autowired
	private CustomersRepository customersRepository;

	public long getCount() {
		long count = customersRepository.count();
		return count;
	}
	
	public List<Customers> findAllCustomers(){
		List<Customers> customers = new ArrayList<>();
		customersRepository.findAll().forEach(customers::add);
		return customers;
	}
	
	public boolean insertCustomers(Customers customers) {
	 try {
		customersRepository.save(customers);
		return true;
	 	} 
	 catch (Exception e) {
		return false;
		}
	}
	
	public Customers findCustomersById(Long id) {
		Customers customers = customersRepository.findById(id).orElse(null);
		return customers;
	}
	
	public boolean deleteCustomers(long id) {
		Customers customers = customersRepository.findById(id).orElse(null);
		if(customers!=null) {
			customersRepository.delete(customers);
			return true;
		}
		return false;
	}
}