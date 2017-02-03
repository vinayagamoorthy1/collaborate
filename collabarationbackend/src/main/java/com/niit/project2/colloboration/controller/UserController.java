package com.niit.project2.colloboration.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.project2.collaboration.dao.Userdao;
import com.niit.project2.collaboration.model.User;

@RestController
public class UserController {
	public static Logger log=LoggerFactory.getLogger(UserController.class);
	@Autowired
	Userdao userdao;
	@Autowired
	User user;
	@RequestMapping("/list")
public ResponseEntity<List<User>> getlistofuser(){
		log.debug("list method started");
		List<User> users=userdao.getlistofuser();
		if(users.isEmpty()){
			user.setErrorCode("404");
			user.setErrorMessage("no user is registered");
			users.add(user);
		}
		else {
		for( User a:users){
			a.setErrorCode("200");
			a.setErrorMessage("user details from database");
		}
		}
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ResponseEntity<User> saveuser(@RequestBody User user,HttpServletRequest request){
		System.out.println("hi controll");
		user.setIs_online('W');
		user.setStatus('W');
		user.setReason("NotApplicable");
		String status=userdao.save(user);
		if(status.equals("success")){
			user.setErrorCode("200");
			user.setErrorMessage("thankyou for Registration");
			log.debug("done");
		}else if(status.equals("exception")){
			user.setErrorCode("404");
			user.setErrorMessage("some error occured contact admin");
			
		}else if(status.equals("idexists")){
			user.setErrorCode("404");
			user.setErrorMessage("user id Already exists try with new one");
		}
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@RequestMapping(value="/autenticate/{id}",method=RequestMethod.POST)
	public ResponseEntity<User> authenticate(@PathVariable("id") String id){
	user=updateuserstatus(id,"A");
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}

private User updateuserstatus(String id,String reason){
	
	user=userdao.get(id);
	if(user==null){
		user=new User();
		user.setErrorCode("404");
		user.setErrorMessage("no record found with particular id");
	}else{
		if(reason.equals("A")){
			user.setIs_online('N');
			user.setStatus('A');
			user.setReason("");
			String status=userdao.update(user);
			if(status.equals("idnotexists")){
				user.setErrorCode("404");
				user.setErrorMessage("no record exists with this id");
			}else if (status.equals("success")){
				user.setErrorCode("200");
				user.setErrorMessage("successfully user updated");
			}else if(status.equals("exception")){
				user.setErrorCode("404");
				user.setErrorMessage("contact admin some exception happened");
				}
		return user;	
		}else{
			user.setIs_online('R');
			user.setStatus('R');
			user.setReason(reason);
			String status=userdao.update(user);
			if(status.equals("idnotexists")){
				user.setErrorCode("404");
				user.setErrorMessage("no record exists with this id");
			}else if (status.equals("success")){
				user.setErrorCode("200");
				user.setErrorMessage("successfully user updated");
			}else if(status.equals("exception")){
				user.setErrorCode("404");
				user.setErrorMessage("contact admin some exception happened");
				}
		return user;	
			
		}
		
	}
	return user;
}
@RequestMapping(value="/reject/{id}/{reason}",method=RequestMethod.POST)
public ResponseEntity<User> rejectUser(@PathVariable("id") String id,@PathVariable("reason") String reason){
	user=updateuserstatus(id, reason);
	return new ResponseEntity<User>(user,HttpStatus.OK);
}
@RequestMapping(value="/login",method=RequestMethod.POST)
public ResponseEntity<User> login(HttpSession httpSession,@RequestBody User user){
	String id=user.getId();
	String password=user.getPassword();
	String status=userdao.validate(id, password);
	if(status.equals("invalid")){
		user.setErrorCode("404");
		user.setErrorMessage("username or password is not correct");
}else if(status.equals("connectexception)")){
		user.setErrorCode("404");
		user.setErrorMessage("could not connect contact admin");
}else if(status.equals("validateexception")){
		user.setErrorCode("404");
		user.setErrorMessage("username or password is ok but could not connect contact admin");
}else if(status.equals("A")){
		user=userdao.get(id);
		user.setIs_online('Y');
		httpSession.setAttribute("LoggedInUserId", id);
      String updatestatus = userdao.update(user);
      if(updatestatus.equals("exception")){
    	  user.setErrorCode("404");
  		user.setErrorMessage("Your details correct but probelm with connection contact admin");  
      }else{
    	 
		user.setErrorCode("200");
		user.setErrorMessage("You logged in successfully");}
}else if(status.equals("R")){
		String details=userdao.reasonforrejection(id);
		if(details.equals("rejctionexception")){
			user.setErrorCode("404");
			user.setErrorMessage("Your registration is rejected to know reason contact admin ");
			}else{
				user.setErrorCode("404");
				user.setErrorMessage("Your registration is rejected for the reason :"+details);
			}
}else if(status.equals("W")){
		user.setErrorCode("404");
		user.setErrorMessage("Your registration is waiting for approval from admin try after 24 hours");
	}
	
	return new ResponseEntity<User>(user,HttpStatus.OK);
}

@RequestMapping("/logout")
public ResponseEntity<User> logout(HttpSession session){
	String id=(String)session.getAttribute("LoggedInUserId");
	if(id==null){
		user=new User();
		user.setErrorCode("404");
		user.setErrorMessage("problem with connection login again");	
	}else{
	session.invalidate();
	user=userdao.get(id);
	user.setIs_online('N');
	String status=userdao.update(user);
	if(status.equals("success")){
		user.setErrorCode("200");
		user.setErrorMessage("you successfully logged out");
	}else if(status.equals("exception")){
		user.setErrorCode("404");
		user.setErrorMessage("connection problem contact admin");	
	}
	}
return new ResponseEntity<User>(user,HttpStatus.OK);
}

@RequestMapping("/newuser")
public ResponseEntity<List<User>> newUsers(){
	List<User> users=userdao.listOfNewUser();
	if(users.isEmpty()){
		User user=new User();
		user.setErrorCode("404");
		user.setErrorMessage("no new user is registered");
		users.add(user);
}else{
	for( User a:users){
		a.setErrorCode("200");
		a.setErrorMessage("new user details from database");
	}

}
	return new ResponseEntity<List<User>>(users,HttpStatus.OK);
}
}
