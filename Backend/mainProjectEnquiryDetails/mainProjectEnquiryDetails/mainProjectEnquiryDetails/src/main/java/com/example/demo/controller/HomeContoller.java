package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cibil;
import com.example.demo.model.CompanyEnquiryDetails;
import com.example.demo.model.Dealer;
import com.example.demo.service.HomeService;

@RestController
@CrossOrigin("*")
public class HomeContoller {
	@Autowired
	HomeService hs;
	
	

	@PostMapping("/savecompanydataintodatabase")
	public CompanyEnquiryDetails consumeReg(@RequestBody CompanyEnquiryDetails save) {
		
		hs.saveCompanyEnquiryDetails(save);
		return save;
	}

	@GetMapping("/getCompanyEnquiryDetails")
	public Iterable<CompanyEnquiryDetails> getData() {
		Iterable<CompanyEnquiryDetails> list = hs.getData();
		return list;

	}

	@GetMapping("/getsingleCustomer/{id}")
	public CompanyEnquiryDetails getSIngleData(@PathVariable("id") int enqId)
	{
		  CompanyEnquiryDetails dd = hs.getSingleData(enqId);
		  return dd;
	}

	
//	@PutMapping("/updatecompanydetails/{id}")
//	public String putData(@PathVariable("id") int id,@RequestBody CompanyEnquiryDetails cc)
//	{
//		return null;
//	}
	
	@GetMapping("allcibilData")
	public Iterable<Cibil> getAllcibilDataa()
	{
		Iterable<Cibil> cbi=hs.getAllcibil();
		
		return cbi;
	}
	
	@PostMapping("/setcibilData")
	public CompanyEnquiryDetails setAllcibilData(@RequestBody CompanyEnquiryDetails ced)
	{
		
		CompanyEnquiryDetails coo=hs.setcibilData(ced);
		return coo;
		
	}
	
	@GetMapping("/getdealerdata")
	public Iterable<Dealer> saveDealerData1()
	{
		 Iterable<Dealer> saveDealerData = hs.saveDealerData();

		return saveDealerData;
		
	}
	
	@PostMapping("/savedealerdata")
	public Dealer saveDealerData(@RequestBody Dealer d)
	{
		hs.saveDealerData(d);
		return d;
		
	}
}
