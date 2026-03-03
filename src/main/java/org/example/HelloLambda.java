package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class HelloLambda implements RequestHandler<Map<String, Object>, String> {

    @Override
    public String handleRequest(Map<String, Object> input, Context context) {
        System.out.println("This is test");
        System.out.println("This is used to to test the git reset");
        System.out.println("This is used to to test the git reset -> second time");
        return "Hello from Lambda! Input = " + input;
    }
}