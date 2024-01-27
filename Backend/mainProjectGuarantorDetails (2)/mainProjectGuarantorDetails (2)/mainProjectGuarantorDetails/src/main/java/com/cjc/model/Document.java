package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Document {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentId;
	
	private int companyEnqId;
	
//	@Lob
//	private byte[] panCard;
	@Lob
	private byte[] rentAggrement;
	@Lob
	private byte[] companyPhotos;
	@Lob
	private byte[] bankStatement;
	@Lob
	private byte[] cancelCheckPhoto;
	@Lob
	private byte[] incomeTaxReturns;
	@Lob
	private byte[] signaturePhoto;
	@Lob
	private byte[] quotationPhoto;
	
	
}
