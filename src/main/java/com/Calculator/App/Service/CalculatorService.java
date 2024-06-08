package com.Calculator.App.Service;

import org.springframework.stereotype.Service;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@Service
public class CalculatorService {

    public String getAnswer(Double num1, String operator, Double num2) {
        double result = 0;
        try {

            switch (operator) {
                case "p":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 == 0) {
                        return "Cannot divide by ZERO!";
                    }
                    result = num1 / num2;
                    break;

                case "%":
                    result = num1 % num2;
                    break;



                default:
                    return "You Entered the wrong input! ";


            }
        } catch (Exception e) {
            return "Error on your code" + e;
        }
        return "The result of " + num1 + " " + operator + " " + num2 + " is: " + result;
    }
}
