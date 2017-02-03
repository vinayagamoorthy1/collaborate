package com.niit.project2.collaboration.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="job")
@Component
public class Job extends BaseDomain{
	@Id
private String id;
private String title;
private String qualification;
private char status;
private String description;
private Date date_time;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public char getStatus() {
	return status;
}
public void setStatus(char status) {
	this.status = status;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getDate_time() {
	return date_time;
}
public void setDate_time(Date date_time) {
	this.date_time = date_time;
}
}
