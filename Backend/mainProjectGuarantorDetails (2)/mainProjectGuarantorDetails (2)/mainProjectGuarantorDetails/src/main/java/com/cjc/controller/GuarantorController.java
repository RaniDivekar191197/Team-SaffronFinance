package com.cjc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.cjc.model.GuarantorDetails;
import com.cjc.service.GuarantorService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin("*")
public class GuarantorController 
{
	@Autowired
	GuarantorService gs;
	
	@PostMapping(value = "/adddoc",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public List<GuarantorDetails> getDataAndPhotoUpload(@RequestPart(required = true,value = "guarantorsignaturePhotos") MultipartFile files9,
			@RequestPart("doc") String doc) throws IOException
	{
		GuarantorDetails gd=new GuarantorDetails();
		gd.setGuarantorsignaturePhotos(files9.getBytes());
		
		
		ObjectMapper om=new ObjectMapper();
		GuarantorDetails gd1=om.readValue(doc, GuarantorDetails.class);

		gd.setGuarantorId(gd1.getGuarantorId());
		gd.setGuarantorName(gd1.getGuarantorName()); 	
		gd.setGuarantorAdhaarNo(gd1.getGuarantorAdhaarNo());
		gd.setGuarantorPanNo(gd1.getGuarantorPanNo());
		gd.setGuarantorMobileNo(gd1.getGuarantorMobileNo());
		gd.setGuarantorOccupation(gd1.getGuarantorOccupation());
		gd.setGuarantorpermanentAddress(gd1.getGuarantorpermanentAddress());
		
		
		List<GuarantorDetails> list=gs.getData(gd);
		
		return list;
		
	}
	
	@GetMapping(value="/getfiles")
	public List<GuarantorDetails> getAllData()
	{
		return gs.getallData();
		
	}
	

}
