package com.niit.project2.collaboration.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="friend")
@Component
public class Friend extends BaseDomain {
	private  String Userid;
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public String getFriendid() {
		return Friendid;
	}
	public void setFriendid(String friendid) {
		Friendid = friendid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getIsonline() {
		return isonline;
	}
	public void setIsonline(String isonline) {
		this.isonline = isonline;
	}
	private String Friendid;
	private String id;
	private String Status ;
	private String isonline;
	

}
