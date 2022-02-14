package com.example;

//import static spark.Spark.*;
import static spark.Spark.get;
import static spark.Spark.port;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class App {

    private static final String PROPIEDAD_AMBIENTE = null;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String perfil;
        port(3456);
        Properties propiedades = new Properties();
        propiedades.load(new FileInputStream(new File("src/main/resources/vars.properties")));
        perfil=propiedades.getProperty("PROPIEDAD_AMBIENTE");
        get("/entornos", (req, res) -> "En el ambiente <"+perfil+">");
    }
    
}
