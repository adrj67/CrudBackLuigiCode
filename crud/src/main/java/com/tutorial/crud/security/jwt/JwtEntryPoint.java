package com.tutorial.crud.security.jwt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;//
import org.springframework.security.web.AuthenticationEntryPoint;//
import org.springframework.stereotype.Component;//

@Component // en realidad deberia llamarse JwtEntryPoint
public class JwtEntryPoint implements AuthenticationEntryPoint{
    
    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
    
    /*@Override
    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException e) throws 
            IOException, ServletException {
        logger.error("fail en el metodo commence");//solo se usa en etapa de produccion
        res.sendError (HttpServletResponse.SC_UNAUTHORIZED, "no autorizado");
        //res.sendError(HttpServletResponse.SC_UNAUTHORIZED);
    }*/
    
    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException e) throws 
            IOException, ServletException {
     res.resetBuffer();
        //logger.error("fail en el metodo commence");//agregado
        //res.sendError (HttpServletResponse.SC_UNAUTHORIZED, "no autorizado");//agregado
        res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        //2res.setHeader("Content-Type", "application/json");
        res.getOutputStream().print("Usuario o Clave incorrectos");
        //2res.getOutputStream().print("{\"status\":401,\"error\":\"Unauthorized\",\"message\":\"No esta autorizado 4\"}" );
        //2res.flushBuffer();
    }
    
}
