package model;

import java.sql.Blob;

public class Candidate {
private int id;
private String firstname;
private String lastname;
private String category;
private Blob cv;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Blob getCv() {
	return cv;
}
public void setCv(Blob cv) {
	this.cv = cv;
}

}
