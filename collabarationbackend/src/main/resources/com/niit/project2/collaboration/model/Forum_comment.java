package com.niit.project2.collaboration.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="forum_comment")
@Component
public class Forum_comment extends BaseDomain {
private Number Id;
private String  Forum_id;
private String User_id;
private String Forum_comment;
private String Comment_date;
public Number getId() {
	return Id;
}
public void setId(Number id) {
	Id = id;
}
public String getForum_id() {
	return Forum_id;
}
public void setForum_id(String forum_id) {
	Forum_id = forum_id;
}
public String getUser_id() {
	return User_id;
}
public void setUser_id(String user_id) {
	User_id = user_id;
}
public String getForum_comment() {
	return Forum_comment;
}
public void setForum_comment(String forum_comment) {
	Forum_comment = forum_comment;
}
public String getComment_date() {
	return Comment_date;
}
public void setComment_date(String comment_date) {
	Comment_date = comment_date;
}



}
