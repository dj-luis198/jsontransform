package com.example;

public class Feature {
    private String type = "Feature";
    private Properties properties;
    private Geometry geometry;

    public Feature(Properties properties, Geometry geometry) {
        this.properties = properties;
        this.geometry = geometry;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
