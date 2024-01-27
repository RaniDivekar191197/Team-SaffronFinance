package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.PermanentAddress;


@Repository
public interface PermanentRepo extends CrudRepository<PermanentAddress, String> {

}
