package org.escuelaing.arep.spark;

import spark.Request;
import spark.Response;

import java.nio.charset.StandardCharsets;

import static spark.Spark.*;

public class SparkApp {
    public static void main(String[] args) {
        HttpServer server = new HttpServer();
        staticFiles.location("/public");
        get("/hello", (req, res) -> "Hello World");
        get("/inicio", (req, res) -> {
            res.redirect("/index.html");
            return null;
        });
            get("/search/*", (request, response) -> "prueba");
       // path("/search", ()->{get("/:API/:value", (req, res) -> "Hello World");});
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}


