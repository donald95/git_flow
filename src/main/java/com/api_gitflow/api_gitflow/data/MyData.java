package com.api_gitflow.api_gitflow.data;

import com.api_gitflow.api_gitflow.dao.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MyData {

    private List<Persona> personaListt;

    public MyData() {
        this.addData();
    }

    public void addData() {

        this.personaListt = new ArrayList<>();

        this.personaListt.add(new Persona("Juan Ramón", "Morneo López", 'M', 28));
        this.personaListt.add(new Persona("Juan Ramón", "Morneo López", 'M', 28));
        this.personaListt.add(new Persona("Juan Ramón", "Morneo López", 'M', 28));
        this.personaListt.add(new Persona("Juan Ramón", "Morneo López", 'M', 28));
        this.personaListt.add(new Persona("Juan Ramón", "Morneo López", 'M', 28));
        this.personaListt.add(new Persona("Juan Ramón", "Morneo López", 'M', 28));
        this.personaListt.add(new Persona("Juan Ramón", "Morneo López", 'M', 28));
    }

    public List<Persona> getData() {
        return this.personaListt;
    }

}
