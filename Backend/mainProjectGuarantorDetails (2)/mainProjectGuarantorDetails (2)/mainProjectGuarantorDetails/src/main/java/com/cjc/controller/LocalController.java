package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.LocalAddress;
import com.cjc.service.LocalService;


@RestController
@CrossOrigin("*")
public class LocalController {
	
	@Autowired
	LocalService ps;
	
	@PostMapping("/regLocalAddress")
	public LocalAddress permanentAddress(@RequestBody LocalAddress pa)
	{
		ps.saveLocalAddress(pa);
		
		return pa;
	}

}
