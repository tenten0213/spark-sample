package sample;

import static spark.Spark.get;
import spark.servlet.SparkApplication;

public class HelloWorld implements SparkApplication {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.init();
    }

    public void init() {
        get("/hello", (request, response) -> "Hello World!");
    }
}