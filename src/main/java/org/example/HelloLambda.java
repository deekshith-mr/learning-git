package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class HelloLambda implements RequestHandler<Map<String, Object>, String> {

    @Override
    public String handleRequest(Map<String, Object> input, Context context) {
        System.out.println("This is test");
        System.out.println("This commit is used to checked for the login2");
        return "Hello from Lambda! Input = " + input;
    }
}