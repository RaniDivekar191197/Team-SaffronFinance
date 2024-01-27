package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.LocalAddress;
import com.cjc.repository.LocalRepo;
import com.cjc.service.LocalService;


@Service
public class LocalServiceImpl implements LocalService {
	
	@Autowired
	LocalRepo lr;

	@Override
	public void saveLocalAddress(LocalAddress pa) {

		lr.save(pa);
		
	}

}
