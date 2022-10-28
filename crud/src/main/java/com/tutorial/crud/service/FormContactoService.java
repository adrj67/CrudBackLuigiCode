// Java Program to Illustrate Creation Of
// Service Interface
package com.tutorial.crud.service;

// Importing required classes
import com.tutorial.crud.entity.FormContacto;

// Interface
public interface FormContactoService {
    // Method
	// To send a simple email
	String sendSimpleMail(FormContacto details);

	// Method
	// To send an email with attachment
	String sendMailWithAttachment(FormContacto details);
}