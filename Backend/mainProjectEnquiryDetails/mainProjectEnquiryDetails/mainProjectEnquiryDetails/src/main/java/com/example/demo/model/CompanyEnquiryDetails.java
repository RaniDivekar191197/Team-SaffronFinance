package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CompanyEnquiryDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String companyname;
	private String companypan;
	private String companyemailid;
	private String cityname;
	private String loanamountrequired;
	private String companycontactnumber;
	@OneToOne (cascade = CascadeType.ALL)
	private Cibil cibil;

}
