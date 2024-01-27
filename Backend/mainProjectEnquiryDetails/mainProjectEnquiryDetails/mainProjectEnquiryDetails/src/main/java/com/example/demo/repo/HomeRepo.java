package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CompanyEnquiryDetails;

@Repository
public interface HomeRepo extends JpaRepository<CompanyEnquiryDetails, Integer>
{
	//Iterable<CompanyEnquiryDetails> findByCibilstatus(String cibilstatus);
   
	
	
	CompanyEnquiryDetails findById(int enqId);
}
