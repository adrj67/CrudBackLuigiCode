// Java Program to Create Rest Controller that
// Defines various API for Sending Mail
package com.tutorial.crud.controler;

// Importing required classes
import com.tutorial.crud.entity.FormContacto;
import com.tutorial.crud.service.FormContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Annotation
@RestController
// Class
public class FormContactoController {
    @Autowired private FormContactoService emailService;

	// Sending a simple Email
	@PostMapping("/sendMail")
	public String
	sendMail(@RequestBody FormContacto details)
	{
		String status
			= emailService.sendSimpleMail(details);

		return status;
	}

	// Sending email with attachment
	@PostMapping("/sendMailWithAttachment")
	public String sendMailWithAttachment(
		@RequestBody FormContacto details)
	{
		String status
			= emailService.sendMailWithAttachment(details);

		return status;
	}
}