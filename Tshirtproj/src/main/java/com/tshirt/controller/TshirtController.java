package com.tshirt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tshirt.entity.Tshirt;
import com.tshirt.services.TshirtService;

@RestController

public class TshirtController {

	@Autowired
	private TshirtService tshirtService;
	
	@RequestMapping("/tshirts")
	public List<Tshirt> getAll(){
		return tshirtService.getAll();
	}
	
	@RequestMapping("/tshirt/{id}")
	public Tshirt geTshirt(@PathVariable long id){
		return tshirtService.getTshirt(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/tshirts")
	public void addTshirt(@RequestBody Tshirt tshirt){
		 tshirtService.addTshirt(tshirt);
	}
	
	
	
}
