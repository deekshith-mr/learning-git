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
        System.out.println("This commit is used to checked for the login2");

        System.out.println("This is mainly used for the learning purpose");

        System.out.println("This commit is used to checked for feature/login3-pr");
        System.out.println("Use the same PR ");

        System.out.println("This is used to create the new PR ");
        System.out.println("This is used to create the new PR 2");
        return "Hello from Lambda! Input = " + input;
    }
}