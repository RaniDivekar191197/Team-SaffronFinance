package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.PreviousLoanDetails;

@Repository
public interface LoanRepo extends CrudRepository<PreviousLoanDetails, Integer> {

}
