package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class LocalAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int localAddId;
	private String officenumber;
	private String streetName;
	private String areaName;
	private String pincode;
	private String cityName;
	private String stateName;
	private String countryName;


}
