package com.app.service;

import com.app.pojo.EmailDetails;

public interface IEmailSrv {
	
		String sendSimpleMail(EmailDetails emailDetails);
		
		String  sendSimpleMailWithAttachment(EmailDetails emailDetails);
 
}

