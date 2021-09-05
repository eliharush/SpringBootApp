package com.hospital.admissionservicems.models;

public class Patient {
private String Id;
private String Name;
private String nationality;

public Patient()
{
	
	}

public Patient(String id,String name,String nationality)
{
setId(id);
setName(name);
setNationality(nationality);
}

/**
 * @return the nationality
 */
public String getNationality() {
	return nationality;
}
/**
 * @param nationalityy the nationality to set
 */
public void setNationality(String nationality) {
	this.nationality = nationality;
}
/**
 * @return the id
 */
public String getId() {
	return Id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	Id = id;
}
/**
 * @return the name
 */
public String getName() {
	return Name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	Name = name;
}

}
