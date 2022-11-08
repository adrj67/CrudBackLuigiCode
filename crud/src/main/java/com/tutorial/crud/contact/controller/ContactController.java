package com.tutorial.crud.contact.controller;

import com.tutorial.crud.contact.dto.ContactValuesDTO;
import com.tutorial.crud.contact.service.ContactService;
import com.tutorial.crud.dto.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @Autowired
    ContactService contactService;
    
    
    /*@Value ("${spring.mail.username}")
    private String contactTo;*/
       
    @PostMapping ("/email/contact")
    public ResponseEntity<?> sendContact(@RequestBody ContactValuesDTO dto){
        contactService.sendContact(dto);
        return new ResponseEntity (new Mensaje("Su mensaje fue enviado con éxito"),HttpStatus.OK);
    }
    
}
