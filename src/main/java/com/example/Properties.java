package com.example;

public class Properties {
    private String tipo;
    private String linea;
    private String descripcion;
    private String codigoParada;


    public Properties(String tipo, String linea, String descripcion) {
        this.tipo = tipo;
        this.linea = linea;
        this.descripcion = descripcion;
    }

    public Properties(String tipo, String linea, String descripcion, String codigoParada) {
        this.tipo = tipo;
        this.linea = linea;
        this.descripcion = descripcion;
        this.codigoParada = codigoParada;
    }

    // Getters and setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCodigoParada() {
        return codigoParada;
    }

    public void setCodigoParada(String codigoParada) {
        this.codigoParada = codigoParada;
    }
}
