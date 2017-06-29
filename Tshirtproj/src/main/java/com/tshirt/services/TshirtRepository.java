package com.tshirt.services;

import org.springframework.data.repository.CrudRepository;

import com.tshirt.entity.Tshirt;

public interface TshirtRepository extends CrudRepository<Tshirt,Long>{
	
	

}
