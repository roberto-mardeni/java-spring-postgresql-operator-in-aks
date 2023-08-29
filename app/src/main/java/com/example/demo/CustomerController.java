package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Resource
	CustomerRepository customerRepository;

	@GetMapping(value = "/")
	public List<Customer> getAll() {
		List<Customer> results = new ArrayList<Customer>();
		customerRepository.findAll().forEach(results::add);
		return results;
	}

	@PostMapping(value = "/")
	public void create(@RequestBody Customer c) {
		customerRepository.save(c);
	}

	@PutMapping(value = "/")
	public void update(@RequestBody Customer c) {
		customerRepository.save(c);
	}

	@DeleteMapping(value = "/")
	public void delete(@RequestBody Customer c) {
		customerRepository.delete(c);
	}
}