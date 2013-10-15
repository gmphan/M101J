package com.tengen;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * Created with IntelliJ IDEA.
 * User: GiangPhan
 * Date: 10/13/13
 * Time: 1:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldSparkStyle {
    public static void main(String[] args){

        Spark.get(new Route("/") {
            @Override
            public Object handle(final Request request, final Response response) {
                return "<b>Hello World from Spark!</b>";
            }
        });

        Spark.get(new Route("/giang") {
            @Override
            public Object handle(final Request request, final Response response) {
                return "Hello World from giang!";
            }
        });


    }
}
