package com.mycompany.problema02;

public class sueldos {
    private int cedula;
    private double sueldoBasico;
    private double porcentajeSueldo;

    public sueldos(int c, double sB) {
        cedula = c;
        sueldoBasico = sB;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int c) {
        cedula = c;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(int sB) {
        sueldoBasico = sueldoBasico;
    }

    public void calcularIva() {
        porcentajeSueldo = sueldoBasico * .12;
    }

    public double obtenerSueldoT() {
        sueldoBasico = sueldoBasico + porcentajeSueldo;
        return sueldoBasico;
    }
}
