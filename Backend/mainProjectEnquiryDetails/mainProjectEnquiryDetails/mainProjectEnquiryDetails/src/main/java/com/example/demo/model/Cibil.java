package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Cibil {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int cibilscore;
    private String cibilstatus;
//    @OneToOne(cascade = CascadeType.ALL)
//    private CompanyEnquiryDetails cs;
}
