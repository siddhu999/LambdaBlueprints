package com.lambda.blueprints;

import java.util.LinkedHashMap;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

/**
 * Hello world Lambda triggered by Cloudwatch rule.
 */
public class HelloWorldLambda {

    private LambdaLogger lambdaLogger;

    public HelloWorldLambda() {

    }

    public void print(LinkedHashMap<String, Object> cloudwatchRule, Context context) {

        this.lambdaLogger = context.getLogger();
        this.lambdaLogger.log("CloudwatchRule=" + cloudwatchRule);
        this.lambdaLogger.log("Hello world!");
    }
}
