package com.example;

//import static spark.Spark.*;
import static spark.Spark.get;

public class App {
    public static void main(String[] args) {
        get("/entornos", (req, res) -> "En el ambiente ");
    }
}
