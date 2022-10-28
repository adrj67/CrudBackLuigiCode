// Java Program to Illustrate EmailDetails Class
package com.tutorial.crud.entity;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Annotations
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormContacto {
    // Class data members
	private String recipient;
	private String msgBody;
	private String subject;
	private String attachment;
}