package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.PreviousLoanDetails;
import com.cjc.service.LoanService;

@RestController
public class LoanController {
	
	@Autowired
	LoanService ls;
	
	@PostMapping("/regPreviousLoanDetails")
	public PreviousLoanDetails previousLoanDetails(@RequestBody PreviousLoanDetails pld) {
	
		ls.savePreviousLoanDetails(pld);
		return pld ;
		
	}

}
