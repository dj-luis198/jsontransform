package com.example;

public class Nodo {
    private double latitud;
    private double longitud;
    private boolean parada;
    private String codigoParada;
    private String descripcionParada;

    // Getters and setters
    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public boolean isParada() {
        return parada;
    }

    public void setParada(boolean parada) {
        this.parada = parada;
    }

    public String getCodigoParada() {
        return codigoParada;
    }

    public void setCodigoParada(String codigoParada) {
        this.codigoParada = codigoParada;
    }

    public String getDescripcionParada() {
        return descripcionParada;
    }

    public void setDescripcionParada(String descripcionParada) {
        this.descripcionParada = descripcionParada;
    }
}
