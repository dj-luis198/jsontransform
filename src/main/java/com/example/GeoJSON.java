package com.example;

import java.util.List;

public class GeoJSON {
    private String type = "FeatureCollection";
    private List<Feature> features;

    public GeoJSON(List<Feature> features) {
        this.features = features;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
