package com.example.demo.service;

import com.example.demo.model.Cibil;
import com.example.demo.model.CompanyEnquiryDetails;
import com.example.demo.model.Dealer;

public interface HomeService
{
	void saveCompanyEnquiryDetails(CompanyEnquiryDetails save);

	Iterable<CompanyEnquiryDetails> getData();

	void saveDatacompany(CompanyEnquiryDetails cc);

	Iterable<Cibil> getAllcibil();

	CompanyEnquiryDetails setcibilData(CompanyEnquiryDetails ced);

	void saveDealerData(Dealer d);

	Iterable<Dealer> saveDealerData();

	CompanyEnquiryDetails getSingleData(int enqId);

	
	
	
	

}
