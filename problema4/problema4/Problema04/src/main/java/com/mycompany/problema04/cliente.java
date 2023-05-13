package com.mycompany.problema04;

public class cliente {
    String nombreCliente;
    String apellidoCliente;

    public cliente(String nC, String aC) {
        nombreCliente = nC;
        apellidoCliente = aC;
    }

    public String getNomCliente() {
        return nombreCliente;
    }

    public void setNomCliente(String nC) {
        nombreCliente = nC;
    }

    public String getApeCliente() {
        return apellidoCliente;
    }

    public void setApeCliente(String aC) {
        apellidoCliente = aC;
    }
}
