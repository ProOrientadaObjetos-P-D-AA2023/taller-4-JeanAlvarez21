package Paquete2;

public class Estudiante {
    
    private String nombre;
    private double calfmat1;
    private double calfmat2;
    private double calfmat3;
    private double promedio;

    public Estudiante(String nom, double cm1, double cm2, double cm3, double prom) {
        nombre = nom;
        calfmat1 = cm1;
        calfmat2 = cm2;
        calfmat3 = cm3;
        promedio = prom;
    }    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomb) {
        nombre = nomb;
    }

    public double getCalfmat1() {
        return calfmat1;
    }

    public void setCalfmat1(double calf1) {
        calfmat1 = calf1;
    }

    public double getCalfmat2() {
        return calfmat2;
    }

    public void setCalfmat2(double calf2) {
        calfmat2 = calf2;
    }

    public double getCalfmat3() {
        return calfmat3;
    }

    public void setCalfmat3(double calf3) {
        calfmat3 = calf3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
            
}
