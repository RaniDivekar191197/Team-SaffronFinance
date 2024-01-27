package com.cjc.service;

import java.util.List;

import com.cjc.model.GuarantorDetails;

public interface GuarantorService {

	List<GuarantorDetails> getData(GuarantorDetails gd);

	List<GuarantorDetails> getallData();

}
