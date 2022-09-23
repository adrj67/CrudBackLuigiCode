/*
package com.tutorial.crud.util;

//una vez que se crearon los roles, se elimina todo el paquete para que no vuelva a crearlos

import com.tutorial.crud.security.entity.Rol;
import com.tutorial.crud.security.enums.RolNombre;
import com.tutorial.crud.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreateRoles implements CommandLineRunner {
    @Autowired
    RolService rolService;
    @Override
    public void run(String... args) throws Exception {
        Rol rolAdmin = new Rol (RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol (RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
    }
}*/