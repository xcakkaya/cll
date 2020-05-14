package com.ittr.cll.controller;

//import static com.ittr.cll.controller.config.Paths.PATH_ID;
//import static com.ittr.cll.controller.config.Paths.CUSTOMERS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ittr.cll.model.Customers;
import com.ittr.cll.service.CustomersService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//can
@RestController
public class CustomersController {

Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private CustomersService customersService;
	
	@RequestMapping("/customers/count")
	public long count() {
		log.info("Search total number of customerss");
		return customersService.getCount();
	}
	
	@RequestMapping("/customers/all")
	public List<Customers> getAllCustomerss(){
		log.info("Searching all customerss");
		return customersService.findAllCustomers();
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/customers/add")
	public boolean addCustomers(@RequestBody Customers customers) {
		
		log.info("Creation/Updating Customers - "+customers.toString());
		return customersService.insertCustomers(customers);
	}
	
	@RequestMapping("/customers/id/{id}" )
	public Customers findById(@PathVariable long id) {
		HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");    
		log.info("Searching customers with ID - "+ id);
		return customersService.findCustomersById(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/delete/{id}")
	public boolean deleteCustomers(@PathVariable long id) {
		return customersService.deleteCustomers(id);
	}
	
}