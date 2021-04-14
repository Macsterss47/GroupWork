package com.example.myfirstwebservice.entity;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 *Represents a Person
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
 * <p>This is the entity for the table Person in myfirstwebservice. </p>
 **/

@Entity
@Table(name = "Person")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
     /**
     * DTO 
     * 
     */

  

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToMany(mappedBy= "person")
    @JsonIgnoreProperties(value = "person")
    private Set<Bank> bank;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private String address;

    //getter-setter SHIFT+ALT+S
	 /**
	  * Getter for the id field
	  * @return id
	  * */	
    public int getId() {
        return id;
    }
    /**
	  * Setter for the id field
	  * @return id
	  * */	
    public void setId(int id) {
        this.id = id;
    }
    /**
	  * Getter for the name field
	  * @return name
	  * */
    public String getName() {
        return name;
    }
    /**
	  * Setter for the name field
	  * @return name
	  * */
    public void setName(String name) {
        this.name = name;
    }
    /**
	  * Getter for the lastName field
	  * @return lastName
	  * */
    public String getLastName() {
        return lastName;
    }
    /**
	  * Setter for the lastName field
	  * @return lastName
	  * */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
	  * Getter for the address field
	  * @return address
	  * */
    public String getAddress() {
        return address;
    }
    /**
	  * Setter for the address field
	  * @return address
	  * */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
	  * Getter for the bank field
	  * @return bank
	  * */
	public Set<Bank> getBank() {
		return bank;
	}
	/**
	  * Setter for the bank field
	  * @return bank
	  * */
	public void setBank(Set<Bank> bank) {
		this.bank = bank;
	}
  


}