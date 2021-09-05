package com.hospital.admissionservicems.models;

public class Diseases {
private String Id;
private String Description;
private String Treament;





public Diseases(String id, String description, String treament) {
	
	setId(id);
    setDescription(description);
	setTreament(treament);
}

public Diseases() {};
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getTreament() {
	return Treament;
}
public void setTreament(String treament) {
	Treament = treament;
}

}
