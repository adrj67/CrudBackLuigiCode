
package com.tutorial.crud.contact.controller;
//import com.tutorial.crud.EmailTemplate2.dto.Details;

import com.tutorial.crud.contact.dto.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.thymeleaf.context.Context;
//import org.thymeleaf.spring4.SpringTemplateEngine;
import javax.mail.internet.MimeMessage;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

@RequestMapping("/testapp")
@CrossOrigin (origins = "http://localhost:4200")
@Controller
public class EmailSender {
    
    @Autowired
    SpringTemplateEngine templateEngine;

    @Autowired
    private JavaMailSender sender;

    @RequestMapping("/getdetails")
    public @ResponseBody Details sendMail(@RequestBody Details details) throws Exception {

        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                StandardCharsets.UTF_8.name());

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("name",details.getName());
        model.put ("nombreUsuario", details.getNombreUsuario());
        model.put("email",details.getEmail());
        model.put("asunto",details.getAsunto());
        model.put("msgbox",details.getMsgbox());

        Context context = new Context();
        context.setVariables(model);
        String html = templateEngine.process("email-template2", context);

        try {
            //helper.setTo(details.getEmail());
            helper.setTo("adrj67@gmail.com");
            helper.setText(html,true);
            helper.setSubject("Contacto CRUD - " + details.getAsunto());
        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }
        sender.send(message);

        return details;

    }
    
}