package com.example.arrayparcelbale;

import java.util.ArrayList;
import java.util.Date;

public class Dueño {

    private String nombre;
    private Date edad;
    ArrayList<Hermano> hermanos;
    
    public Dueño() {
        nombre = "Pepe";
        edad = new Date();
        hermanos = new ArrayList<Hermano>();
        for (int i = 0; i < 10; i++) {
            Hermano h = new Hermano();
            hermanos.add(h);
        }
    }

    @Override
    public String toString() {
        return "Dueño [nombre=" + nombre + ", edad=" + edad + ", perro=" + hermanos + "]";
    }
    
    
}
