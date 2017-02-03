package com.niit.project2.colloboration.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.project2.collaboration.dao.JobDao;
import com.niit.project2.collaboration.model.Job;

@RestController
public class JobController {
	@Autowired
	Job job;
	@Autowired
	JobDao jobdao;
@RequestMapping("/listofjobs")
	public ResponseEntity<List<Job>> list(){
	List<Job> list=jobdao.list();
	if(list.isEmpty()){
		job.setErrorCode("404");
		job.setErrorMessage("no record found");
		list.add(job);
	}
	
	return new ResponseEntity<List<Job>>(list,HttpStatus.OK);
}
@RequestMapping(value="/savejob",method=RequestMethod.POST)
public ResponseEntity<Job> savejob(@RequestBody Job job){
	System.out.println("entering");
	job.setStatus('N');
	job.setDate_time(new Date());
	String status=jobdao.save(job);
	if(status.equals("idexists")){
		job.setErrorCode("404");
		job.setErrorMessage("id already exists with this id:"+job.getId());
		
	}else if(status.equals("exception")){
		job.setErrorCode("404");
		job.setErrorMessage("error occured contact admin"); 
		
	}else if(status.equals("success")){
		job.setErrorCode("200");
		job.setErrorMessage("you successfully registered"); 
}
	return new ResponseEntity<Job>(job,HttpStatus.OK);
}
}
