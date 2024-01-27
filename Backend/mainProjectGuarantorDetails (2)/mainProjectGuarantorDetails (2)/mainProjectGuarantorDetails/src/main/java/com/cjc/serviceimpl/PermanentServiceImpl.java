package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.PermanentAddress;
import com.cjc.repository.PermanentRepo;
import com.cjc.service.PermanentService;



@Service
public class PermanentServiceImpl implements PermanentService {
	
	@Autowired
	PermanentRepo pr;

	@Override
	public void savePermanentAddress(PermanentAddress pa) {

		pr.save(pa);
		
	}

}
