package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.PreviousLoanDetails;
import com.cjc.repository.LoanRepo;
import com.cjc.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService{
	
	@Autowired
	LoanRepo lr;

	@Override
	public void savePreviousLoanDetails(PreviousLoanDetails pld) {

		lr.save(pld);
	}

}
