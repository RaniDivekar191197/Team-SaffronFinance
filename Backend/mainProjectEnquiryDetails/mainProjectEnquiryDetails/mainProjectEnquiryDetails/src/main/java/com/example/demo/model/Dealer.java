package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dealer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dealerregistrationid;
	private String dealername;
	private String delaerofficename;
	private String dealerofficeaddress;
	private String dealerbankname;
	private String dealerbankaccountnumber;
	private String dealerbankifsc;
	private String dealerbankaddress;
	private String dealeremailid;
	private String dealermobilenumber;

}
