package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Converter {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String inputFile = "input.json";
        if (args.length > 0) {
            inputFile = args[0];
        }

        try (Reader reader = new FileReader(inputFile)) {
            // Read input JSON
            Input input = gson.fromJson(reader, Input.class);

            if (input != null && input.getNodos() != null && !input.getNodos().isEmpty()) {
                // Create features
                List<Feature> features = new ArrayList<>();

                // 1. Create LineString for the route
                List<Object> lineStringCoordinates = new ArrayList<>();
                for (Nodo nodo : input.getNodos()) {
                    lineStringCoordinates.add(List.of(nodo.getLongitud(), nodo.getLatitud()));
                }
                Geometry lineStringGeometry = new Geometry("LineString", lineStringCoordinates);
                Properties lineStringProperties = new Properties("recorrido", "LINEA_DEFAULT", "DESCRIPCION_DEFAULT");
                features.add(new Feature(lineStringProperties, lineStringGeometry));

                // 2. Create Points for the stops
                for (Nodo nodo : input.getNodos()) {
                    if (nodo.isParada()) {
                        List<Object> pointCoordinates = List.of(nodo.getLongitud(), nodo.getLatitud());
                        Geometry pointGeometry = new Geometry("Point", pointCoordinates);
                        Properties pointProperties = new Properties("parada", "LINEA_DEFAULT", nodo.getDescripcionParada(), nodo.getCodigoParada());
                        features.add(new Feature(pointProperties, pointGeometry));
                    }
                }

                // Create GeoJSON object
                GeoJSON geoJSON = new GeoJSON(features);

                // Print GeoJSON
                System.out.println(gson.toJson(geoJSON));
            } else {
                System.err.println("El archivo JSON no es válido o no contiene 'nodos'.");
            }

        } catch (java.io.FileNotFoundException e) {
            System.err.println("ERROR: No se pudo encontrar el archivo '" + inputFile + "'.");
            System.err.println("Asegúrate de que el archivo exista en el mismo directorio desde donde ejecutas el comando, o proporciona la ruta completa.");
        } catch (Exception e) {
            System.err.println("Ocurrió un error al procesar el archivo:");
            e.printStackTrace();
        }
    }
}
