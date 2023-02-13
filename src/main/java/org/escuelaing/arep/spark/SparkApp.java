package org.escuelaing.arep.spark;

import spark.Request;
import spark.Response;

import static spark.Spark.*;

public class SparkApp {
    public static void main(String[] args) {
        staticFiles.location("/public");
        get("/hello", (req, res) -> "Hello World");
        get("/inicio", (req, res) -> {
            res.redirect("/index.html");
            return null;
        });
        get("/search", (req, res) -> busqueda(req, res));
    }
    private static Object busqueda(Request req, Response res) {
        res.type("application/json");
        String json ="{\n" +
                "  \"hola\": \"prueba\"\n" +
                "}" ;
        return json;
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}


