package com.employees;

public class Employee {
	private Integer Id;
	private String firstName;
	private String lastName;
	private String email;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Employee(Integer id, String firstName, String lastName, String email) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public Employee() {
		super();
	}
	
	
	
}
