package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.GuarantorDetails;
import com.cjc.repository.GuarantorRepository;
import com.cjc.service.GuarantorService;

@Service
public class GuarantorServiceImpl implements GuarantorService
{
	
	@Autowired
	GuarantorRepository gr;

	@Override
	public List<GuarantorDetails> getData(GuarantorDetails gd) {
		gr.save(gd);
		
		List<GuarantorDetails> l1=gr.findAll();
		return l1;
	}

	@Override
	public List<GuarantorDetails> getallData() {
		
		return gr.findAll();
	}

}
