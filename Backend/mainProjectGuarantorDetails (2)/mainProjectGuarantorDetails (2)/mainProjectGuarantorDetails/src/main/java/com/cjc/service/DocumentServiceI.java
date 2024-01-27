package com.cjc.service;

import java.util.List;

import com.cjc.model.Document;

public interface DocumentServiceI {

	List<Document> savedoc(Document d);

	List<Document> getdata();

}
