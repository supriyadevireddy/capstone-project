package com.app.pojo;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

			@Data
			@NoArgsConstructor
			@AllArgsConstructor
			@ToString
			public class EmailDetails {
				
			@NotNull
			private String recipientMailId;
			@NotNull
			private String subject;
			private String body;
			private String attachmentAddress;
			public Object getRecipientMailId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			}
