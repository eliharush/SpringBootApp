package com.hospital.hrservicems.models;

public class Employee {
private String Id;
private String Firstname ;
private String Lastname;
private String Specialty;


public Employee() {};




public Employee(String id, String firstname, String lastname, String specialty) {
	super();
	setId(id);
	setFirstname(firstname);
	setLastname(lastname);
	setSpecialty(specialty);
}
public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}

public String getFirstname() {
	return Firstname;
}

public void setFirstname(String firstname) {
	this.Firstname = firstname;
}

public String getLastname() {
	return Lastname;
}

public void setLastname(String lastname) {
	this.Lastname = lastname;
}

public String getSpecialty() {
	return Specialty;
}

public void setSpecialty(String specialty) {
	this.Specialty = specialty;
}
	

}
