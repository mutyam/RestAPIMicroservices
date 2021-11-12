/**
 * 
 */
package com.mj.spring.rest.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * @author mjella
 *
 */
public class User {

	private int id;
	
	@Size(min=2, message = "Name should have atleast 2 characters")
	private String name;
	
	@Past
	private Date dateofBirth;
	
	public User() {	}
	
	public User(int id, String name, Date dateofBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateofBirth = dateofBirth;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
}
