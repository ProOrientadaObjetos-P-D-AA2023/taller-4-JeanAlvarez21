package com.mycompany.problema01;

public class Universidad {
    private String nombre;
    private String direccion;
    
    // constructor
    public Universidad() {
        this.nombre = "Univerdidad Tecncica Particullar de Loja";
        this.direccion = "Loja";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
