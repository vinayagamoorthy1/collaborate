package com.niit.project2.collaboration.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="event")
@Component
public class Event extends BaseDomain {
	private String id;
	private String name;
	private String venune;
	private String Description;
	private String Datetime ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVenune() {
		return venune;
	}
	public void setVenune(String venune) {
		this.venune = venune;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDatetime() {
		return Datetime;
	}
	public void setDatetime(String datetime) {
		Datetime = datetime;
	}
	

}
