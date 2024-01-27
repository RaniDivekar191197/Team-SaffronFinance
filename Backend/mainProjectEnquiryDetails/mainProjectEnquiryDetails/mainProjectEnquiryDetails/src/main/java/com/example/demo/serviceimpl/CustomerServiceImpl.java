package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LoanEmiCalculation;
import com.example.demo.repo.LoanEmiRepository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService
{


	@Autowired
	LoanEmiRepository ler;
	
   public void emiData(LoanEmiCalculation lec) 
	{
	ler.save(lec);
		
	}

    @Override
	public List<LoanEmiCalculation> getloan() {
		
		return (List<LoanEmiCalculation>) ler.findAll();
	}


	


	
}
