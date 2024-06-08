package com.Calculator.App.Service;

import org.springframework.stereotype.Service;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@Service
public class CalculatorService {

    public String getAnswer(Double num1,String operator, Double num2) {
        double result = 0;

        switch (operator) {
            case "plus":
                result = num1 + num2;
                break;

            case "-" :
                result = num1 - num2;
                break;

            case "*" :
                result = num1 * num2;
                break;

            case "/" :
                result = num1 / num2;
                break;

            default:
                System.out.println("You Entered the wrong input! ");

        }
        return "The result " + num1 + " " + operator + " "
                + num2 + " is equal to: " + result;
    }
}
