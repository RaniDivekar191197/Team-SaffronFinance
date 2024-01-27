package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class LoanEmiCalculation {
	@Id
	
	private int loanemiId;

	private float annualinterestRate;

	private int numberofYear;

	private float loanAmount;

	private float monthlypayment;

//	private LocalDate nextEmiDate;

//	public int getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
//
//	
//	
//	
//	
//
//	
//
//public int getLoanemiId() {
//		return LoanemiId;
//	}
//
//	public void setLoanemiId(int loanemiId) {
//		LoanemiId = loanemiId;
//	}
//
//	public float getAnnualinterestRate() {
//		return annualinterestRate;
//	}
//
//	public void setAnnualinterestRate(float annualinterestRate) {
//		this.annualinterestRate = annualinterestRate;
//	}
//
//
//	public int getNumberofYear() {
//		return numberofYear;
//	}
//
//	public void setNumberofYear(int numberofYear) {
//		this.numberofYear = numberofYear;
//	}
//
//	public double getLoanAmount() {
//		return loanAmount;
//	}
//
//	public void setLoanAmount(double loanAmount) {
//		this.loanAmount = loanAmount;
//	}
//
//	public double getMonthlypayment() {
//		return monthlypayment;
//	}
//
//	public void setMonthlypayment(double monthlypayment) {
//		this.monthlypayment = monthlypayment;
//	}

}
