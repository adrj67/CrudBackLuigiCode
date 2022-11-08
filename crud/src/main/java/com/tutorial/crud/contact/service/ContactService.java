package com.tutorial.crud.contact.service;

import com.tutorial.crud.contact.dto.ContactValuesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    
    @Autowired
    JavaMailSender javaMailSender;
    
    @Value("${spring.mail.username}")
    private String contactFrom;
    
    
    
    public void sendContact(ContactValuesDTO dto){
        
        SimpleMailMessage message = new SimpleMailMessage();
        
        message.setFrom (contactFrom);
        message.setTo(dto.getContactTo());
        message.setSubject(dto.getContactsubject());
        message.setText(dto.getContactText());
        
        javaMailSender.send(message);
    }

    
    
}
