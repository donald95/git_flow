package com.api_gitflow.api_gitflow.Controller;

import com.api_gitflow.api_gitflow.dao.Empleado;
import com.api_gitflow.api_gitflow.dao.Empleado;
import com.api_gitflow.api_gitflow.server.serverApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.EmpleadoServicio;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class EmpleadoController {

    @GetMapping("/todo")
    public List<Empleado> obtenerTodo() {
        return null;
    }
}
