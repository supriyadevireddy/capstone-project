package com.app.service;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.app.pojo.EmailDetails;


@Service
public class EmailSrvImpl<MimeMessageHelper, MimeMessage, mailsender, mailsender> implements IEmailSrv{
	
	                @Autowired
	  				private JavaMailSender mailsender;
	
	                
	                @Value("${spring.mail.username}")
	                private String senderEmailId;
	                
	              // we need to byhart  some of steps  
	                

					public String sendSimpleMail(EmailDetails emailDetails) {
						
					SimpleMailMessage mailMessage = new SimpleMailMessage(); // this simplemailmessage is used in simplemail
						
					    mailMessage.setFrom(senderEmailId);
						mailMessage.setTo(emailDetails.getRecipientMailId());
						mailMessage.setSubject(emailDetails.getSubject());
					    mailMessage.setText(emailDetails.getBody());
						
						mailsender.send(mailMessage);
						
						return "send simple mail sucessfully";
					}
				
					public String sendSimpleMailWithAttachment(EmailDetails emailDetails) {
						
						MimeMessage mimeMessage = mailsender.createMimeMessage(); // mimemessage is used in attachmentmail
						
						try {
							MimeMessageHelper mimeMessageHelper  = new MimeMessageHelper(mimeMessage ,  true); // this is a predefined class
							
							mimeMessageHelper.setFrom(senderEmailId);
							mimeMessageHelper.setTo(emailDetails.getRecipientMailId());
							mimeMessageHelper.setSubject(emailDetails.getSubject());
							mimeMessageHelper.setText(emailDetails.getAttachmentAddress());
							
							FileSystemResource fs = new FileSystemResource(new File(emailDetails.getAttachmentAddress()));
							mimeMessageHelper.addAttachment(fs.getFilename(),fs );
							
							
						} catch (MessagingException e) {
							e.printStackTrace();
						}
						
						mailsender.send(mimeMessage);
						
						return null;
					}

}

