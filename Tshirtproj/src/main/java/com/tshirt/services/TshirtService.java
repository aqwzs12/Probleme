package com.tshirt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tshirt.entity.Tshirt;

@Service
public class TshirtService {
	@Autowired
	private TshirtRepository tshirtRepository;

	public List<Tshirt> getAll() {
		List<Tshirt> tshirts = new ArrayList<Tshirt>();
		tshirtRepository.findAll().forEach(tshirts::add);
		return tshirts;
	}

	public void addTshirt(Tshirt tshirt) {
		tshirtRepository.save(tshirt);
	}

	public void deleteTshirt(Long id) {
		tshirtRepository.delete(id);
	}

	public Tshirt getTshirt(Long id) {
		return tshirtRepository.findOne(id);
	}

}
