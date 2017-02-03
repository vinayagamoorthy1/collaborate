package com.niit.project2.collaboration.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="forum")
@Component

public class Forum extends  BaseDomain {
  private String id;
  private String USer_id;
  private String message;
  private String Created_date;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUSer_id() {
	return USer_id;
}
public void setUSer_id(String uSer_id) {
	USer_id = uSer_id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getCreated_date() {
	return Created_date;
}
public void setCreated_date(String created_date) {
	Created_date = created_date;
}
  
  
}
