package com.api_gitflow.api_gitflow.data;

import com.api_gitflow.api_gitflow.dao.Empleado;

import java.util.ArrayList;
import java.util.List;

public class MyData {
    private List<Empleado> EmpleadoLista;

    public void addData() {

        this.EmpleadoLista = new ArrayList<>();
        this.EmpleadoLista.add(new Empleado("Jua", "López", 'M', 28));
    }
    public List<Empleado> getData() {
        return this.personaListt;
    }
}
