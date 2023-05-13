package com.mycompany.problema02;

public class datosProfesore {
    private String nombre;
    private String apellido;

    public datosProfesore(String n, String a) {
        nombre = n;
        apellido = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    }
}
