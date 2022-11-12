package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.EmailDetails;
import com.app.service.IEmailSrv;


@RestController
@RequestMapping(value="/email")
public class EmailController {
	
	
			@Autowired
			private IEmailSrv emailsrv;
			
	         @PostMapping(value="/simple")
			public  ResponseEntity<String> sendSimpleMail(@RequestBody @Valid EmailDetails  emailDetails){
				
			String result =emailsrv.sendSimpleMail(emailDetails);
				
			return ResponseEntity .ok(result);
			
			}
	         
	         @PostMapping(value="/withattachment")
	         public ResponseEntity<String>sendMailWithAttachment(@RequestBody @Valid EmailDetails emailDetails){
	        	 
	         String result = emailsrv.sendSimpleMailWithAttachment(emailDetails);
	        	 
		    return ResponseEntity.ok(result);
	        	 
	         }
}
		


