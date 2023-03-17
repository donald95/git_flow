package com.api_gitflow.api_gitflow.Controller;

import com.api_gitflow.api_gitflow.dao.Persona;
import com.api_gitflow.api_gitflow.server.ServerApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.PersonaServicio;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @GetMapping("/todo")
    public List<Persona> obtenerTodo() {
        return null;
    }
}
