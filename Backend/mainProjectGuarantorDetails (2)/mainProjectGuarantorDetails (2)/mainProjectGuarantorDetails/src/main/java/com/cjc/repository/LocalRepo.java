package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.LocalAddress;


@Repository
public interface LocalRepo extends CrudRepository<LocalAddress, String> {

}
