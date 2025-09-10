package com.example;

import java.util.List;

public class Geometry {
    private String type;
    private List<Object> coordinates;

    public Geometry(String type, List<Object> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Object> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Object> coordinates) {
        this.coordinates = coordinates;
    }
}
