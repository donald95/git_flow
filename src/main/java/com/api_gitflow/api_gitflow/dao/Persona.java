package com.api_gitflow.api_gitflow.dao;

import lombok.Data;

@Data
public class Persona {
    private String nombre;
    private String apellido;
    private Character sexo;
    private Integer edad;

    public Persona(String nombre, String apellido, Character sexo, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }
}
