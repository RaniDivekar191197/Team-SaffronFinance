package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Email {
	@Id
	private String toEmail;
	private String fromEmail;
	private String subject;
	private String textmsg;
	private String path;

	


}
