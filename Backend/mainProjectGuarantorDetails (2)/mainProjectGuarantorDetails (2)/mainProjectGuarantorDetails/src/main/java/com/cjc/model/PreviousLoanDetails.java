package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PreviousLoanDetails 
{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int previousLoanId;
	private String previousLoanType;
	private int previousLoanTenurePending;
	private double previousLoanAmount;
	private double previousLoanEmiAmount;
	private String previousLoanLastPaidDate;
	

}
