
package com.mycompany.problema02;

public class Problema02 {

    public static void main(String[] args) {
        System.out.println("Problema02");
        String nombre = "Mochix";
        String apellido = "Ortix";

        datosProfesore d = new datosProfesore(nombre, apellido);

        int cedula = 1105906035;
        double sueldoBasico = 450;

        sueldos s = new sueldos(cedula, sueldoBasico);

        s.calcularIva();

        System.out.println("EL nombre del profesor es: " + d.getNombre() + d.getApellido());
        System.out.println("Con numero de cedula: " + s.getCedula());
        System.out.println("Con un sueldo de: " + s.obtenerSueldoT());
    }
}
