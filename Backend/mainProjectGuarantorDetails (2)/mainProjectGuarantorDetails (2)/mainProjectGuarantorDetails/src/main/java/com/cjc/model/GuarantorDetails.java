package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class GuarantorDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guarantorId;
	private String guarantorName;
	private String guarantorAdhaarNo;
	private String guarantorPanNo;
	private Long guarantorMobileNo;
	private String guarantorOccupation;
	@Lob
	private byte[] guarantorsignaturePhotos;
	private String guarantorpermanentAddress;

}
