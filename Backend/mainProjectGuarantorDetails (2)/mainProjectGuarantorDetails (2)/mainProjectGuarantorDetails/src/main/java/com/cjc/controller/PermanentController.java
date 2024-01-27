package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.PermanentAddress;
import com.cjc.service.PermanentService;


@RestController
@CrossOrigin("*")
public class PermanentController {
	
	@Autowired
	PermanentService ps;
	
	@PostMapping("/regPermanentAddress")
	public PermanentAddress permanentAddress(@RequestBody PermanentAddress pa)
	{
		ps.savePermanentAddress(pa);
		
		return pa;
	}

}
