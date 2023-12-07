package com.shoppingmall.controller;

import java.util.List;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingmall.entity.Admin;

import com.shoppingmall.service.Adminservice;



@RestController
@CrossOrigin("http://localhost:3000")
public class Admincontroller {
	
	@Autowired
	private Adminservice service;
	
	
	//get all the admins
	//localhost:8080/admins
	@GetMapping("/admins")
	public List<Admin> list()
	{   	
		return service.listAll();
	}
	
	
	//get by id
	//localhost:8080/admins/id
	@GetMapping("/admins/{id}")
	public ResponseEntity<Admin> get(@PathVariable int id)
	{
		try {
			Admin admin=service.get(id);
			return new ResponseEntity<Admin>(admin,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	
	}
	
	
	//creates admin
	//localhost:8080/admins
	@PostMapping("/admins/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@RequestBody Admin admin)
	{
		service.save(admin);
	}
	
	
	//update admin
	//localhost:8080/admins/id
	@PutMapping("/admins/update/{id}")
	public ResponseEntity<?> update(@RequestBody Admin admin,@PathVariable Integer id)
	{
		try {
			Admin existadmin=service.get(id);
			service.save(admin);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	//delete admin
	//localhost:8080/admins/id
	@DeleteMapping("/admins/{id}")
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	

}
