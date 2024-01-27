package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cibil;
import com.example.demo.model.CompanyEnquiryDetails;
import com.example.demo.model.Dealer;
import com.example.demo.repo.CibilRepo;
import com.example.demo.repo.DealerRe;
import com.example.demo.repo.HomeRepo;
import com.example.demo.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepo hr;
	
	@Autowired
	DealerRe dr;

	@Autowired
	CibilRepo cr;
	int lower = 700;
	int upper = 900;

	@Override
	public Iterable<CompanyEnquiryDetails> getData() {
		
		return hr.findAll();	
	}

	@Override
	public void saveCompanyEnquiryDetails(CompanyEnquiryDetails save) {

		hr.save(save);
/*		
		Cibil cc=new Cibil();
	
		
*/
	}

	@Override
	public void saveDatacompany(CompanyEnquiryDetails save) {

		Cibil cc = new Cibil();

	}

	@Override
	public Iterable<Cibil> getAllcibil() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompanyEnquiryDetails setcibilData(CompanyEnquiryDetails save) {
		
		int number = lower + (int) (Math.random() * ((upper - lower) + 1));
		//	save.getCibil().setId(number++);
			
			if (number > 750) {
				System.out.println(number);
				System.out.println("You are Eligible for loan approval");

				save.getCibil().setCibilscore(number);
				save.getCibil().setCibilstatus("Approved");
		    	return	hr.save(save);
				

			} else {

				save.getCibil().setCibilscore(number);
				save.getCibil().setCibilstatus("Rejected");
				System.out.println("You are Not Eligible for loan approval");
				return hr.save(save);
				
				
			}

	}

	@Override
	public void saveDealerData(Dealer d) {
		
		dr.save(d);
	}

	@Override
	public Iterable<Dealer> saveDealerData() {
	
		return dr.findAll();
	}

	@Override
	public CompanyEnquiryDetails getSingleData(int enqId) {
		
		return hr.findById(enqId);
	}

	
	
}
