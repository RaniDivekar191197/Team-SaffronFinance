package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Cibil;

public interface CibilRepo extends CrudRepository<Cibil, Integer> {

//	Iterable<Cibil> findByCibilstatus(String cibilstatus);
}
