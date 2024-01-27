package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Document;
import com.cjc.repository.DocumentRepository;
import com.cjc.service.DocumentServiceI;

@Service
public class DocementServiceImpl implements DocumentServiceI
{
	@Autowired
	DocumentRepository dr;

	@Override
	public List<Document> savedoc(Document d) 
	{
		dr.save(d);
		List<Document>l1=dr.findAll();
				return l1;
	}

	@Override
	public List<Document> getdata() {
				return dr.findAll();
	}

}
