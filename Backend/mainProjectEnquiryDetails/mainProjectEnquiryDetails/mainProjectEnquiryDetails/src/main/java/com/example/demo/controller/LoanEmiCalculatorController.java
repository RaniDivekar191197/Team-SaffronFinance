package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoanEmiCalculation;
import com.example.demo.service.CustomerService;



@RestController
@CrossOrigin("*")
public class LoanEmiCalculatorController 
{
	@Autowired
	CustomerService cs;

	@PostMapping("/emi")
	public void emiData(@RequestBody LoanEmiCalculation lec)
	{
		LocalDate aa=LocalDate.now().minusYears(0).minusMonths(0).minusDays(0);
		LocalDate nextEmidate=aa.plusYears(0).plusMonths(1).withDayOfMonth(3);
		
		System.out.println("lst prm date"+aa);
		System.out.println("next prm date"+nextEmidate);
		float interestrate=lec.getAnnualinterestRate();
		
		float monthlyinterest=interestrate/1200;
		
		int noofyear=lec.getNumberofYear();
		
		float loanamt=lec.getLoanAmount();
		
		float monthlypayment=(float) (loanamt*monthlyinterest/(1-1/Math.pow(1+monthlyinterest, noofyear*12)));
		lec.setMonthlypayment(monthlypayment);
		
	//	lec.setNextEmiDate(nextEmidate);
		
		System.out.println(nextEmidate);
		
		System.out.println("monthly intrest: " +monthlyinterest);
		System.out.println(monthlypayment);
		
		cs.emiData(lec);
		
		
	}
	
	@GetMapping("/getemi")
	public List<LoanEmiCalculation> getloan()
	{
		return cs.getloan();
		
	}
	
	
	
}
