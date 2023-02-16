package org.escuelaing.arep.spark;

import spark.Request;
import spark.Response;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static spark.Spark.*;

public class SparkApp {
    static HttpServer httpServer = HttpServer.getInstance();
    public static void main(String[] args) throws IOException {
        staticFiles.location("/public");
        get("/hello", (req, res) -> "Hello World");
        get("/inicio", (req, res) -> {
            res.redirect("/index.html");
            return null;
        });
        get("/search/*", (req,res) -> "ya");
        httpServer.run(args);
       // path("/search", ()->{get("/:API/:value", (req, res) -> "Hello World");});
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}


