package com.cjc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.model.Document;
import com.cjc.service.DocumentServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping("/document")
@CrossOrigin("*")
public class DocumentController 
{
	
	
	@Autowired 
	DocumentServiceI si;
	
	@PostMapping(value = "/adddoc",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public List<Document> filesUpload(
			//@RequestPart(required = true,value = "panCard") MultipartFile file1,
			@RequestPart(required = true,value = "rentAggrement") MultipartFile file2,
			@RequestPart(required = true,value = "companyPhotos") MultipartFile file3,
			@RequestPart(required = true,value = "bankStatement") MultipartFile file4,
			@RequestPart(required = true,value = "cancelCheckPhoto") MultipartFile file5,
			@RequestPart(required = true,value = "incomeTaxReturns") MultipartFile file6,
			@RequestPart(required = true,value = "signaturePhoto") MultipartFile file7,
			@RequestPart(required = true,value = "quotationPhoto") MultipartFile file8,
//			@RequestPart(required = true,value = "guarantorsignaturePhotos") MultipartFile file9,
			@RequestPart("doc") String doc
	        ) throws IOException 
	
	{
		Document d =new Document();
	//	d.setPanCard(file1.getBytes());
		d.setRentAggrement(file2.getBytes());
		d.setCompanyPhotos(file3.getBytes());
		d.setBankStatement(file4.getBytes());
		d.setCancelCheckPhoto(file5.getBytes());
		d.setIncomeTaxReturns(file6.getBytes());
		d.setSignaturePhoto(file7.getBytes());
		d.setQuotationPhoto(file8.getBytes());
		
		
		ObjectMapper om=new ObjectMapper();
		Document d1=om.readValue(doc, Document.class);
		
		
		d.setCompanyEnqId(d1.getCompanyEnqId());
		System.out.println(d.getCompanyEnqId());
		
//		ObjectMapper om1=new ObjectMapper();
//		LocalAddress ad=om1.readValue(doc1, LocalAddress.class);
		
//		LocalAddress ad1=new LocalAddress();
//		ad1.setOfficenumber(ad.getOfficenumber());
//		ad1.setStreetName(ad.getStreetName());
//		ad1.setAreaName(ad.getAreaName());
//		ad1.setPincode(ad.getPincode());
//		ad1.setCityName(ad.getCityName());
//		ad1.setStateName(ad.getStateName());
//		ad1.setCountryName(ad.getCountryName());
//		d.setLa(ad1);
//		
//		
//		
//		ObjectMapper om2=new ObjectMapper();
//		PermanentAddress pa=om2.readValue(doc2, PermanentAddress.class);
//		
//		PermanentAddress pa1=new PermanentAddress();
//		pa1.setOfficenumber(pa.getOfficenumber());
//		pa1.setStreetName(pa.getStreetName());
//		pa1.setAreaName(pa.getAreaName());
//		pa1.setPincode(pa.getPincode());
//		pa1.setCityName(pa.getCityName());
//		pa1.setStateName(pa.getStateName());
//		pa1.setCountryName(pa.getCountryName());
//		d.setPa(pa1);
//		
//		
//		ObjectMapper om3=new ObjectMapper();
//		GuarantorDetails gd=om3.readValue(doc3, GuarantorDetails.class);
//		
//		GuarantorDetails gd1=new GuarantorDetails();
//		gd1.setGuarantorName(gd.getGuarantorName());
//		gd1.setGuarantorAdhaarNo(gd.getGuarantorAdhaarNo());
//		gd1.setGuarantorPanNo(gd.getGuarantorPanNo());
//		gd1.setGuarantorMobileNo(gd.getGuarantorMobileNo());
//		gd1.setGuarantorOccupation(gd.getGuarantorOccupation());
//		gd1.setGuarantorsignaturePhotos(file9.getBytes());
//		gd1.setGuarantorpermanentAddress(gd.getGuarantorpermanentAddress());
//		d.setGd(gd1);
//		
//		
//		
//		ObjectMapper om4=new ObjectMapper();
//		PreviousLoanDetails pld=om4.readValue(doc4, PreviousLoanDetails.class);
//		
//		PreviousLoanDetails pld1=new PreviousLoanDetails();
//		pld1.setPreviousLoanType(pld.getPreviousLoanType());
//		pld1.setPreviousLoanTenurePending(pld.getPreviousLoanTenurePending());
//		pld1.setPreviousLoanAmount(pld.getPreviousLoanAmount());
//		pld1.setPreviousLoanAmount(pld.getPreviousLoanAmount());
//		pld1.setPreviousLoanLastPaidDate(pld.getPreviousLoanLastPaidDate());
//		d.setLoan(pld1);
		
		
		List<Document> list=si.savedoc(d);
		return list;
		
	}
	
	@GetMapping(value = "/getdata")
	public List<Document> getData()
	{
		return si.getdata();
		
	}
	
	

}
