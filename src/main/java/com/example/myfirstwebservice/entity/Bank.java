package com.example.myfirstwebservice.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
/**
 *Represents the bank of the Person
 *@author Group 1
 *@version 1.0
 *@since March 22, 2021
 *
 *<h1>Collaborators:</h1>
 *<ul>
 * <li>Macsterss47@github.com</li>
 * <li>ivanclemente20@github.com</li>
 * <li>Joseph1899@github.com</li>
 * <li>JesterAlcantara@github.com</li>
 * </ul>
 * <p>This is the entity for the table Bank in myfirstwebservice. </p>
 **/


@Entity
@Table(name = "Bank")
public class Bank implements Serializable {
	private static final long serialVersionUID = 1L;
	 /**
	 * DTO 
	 * 
	 */
	@ManyToOne
	@JoinColumn(name="person_id")
	private Person person; //Person id
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String accountName;
	
	@Column
	private String bankAddress;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	
	
}