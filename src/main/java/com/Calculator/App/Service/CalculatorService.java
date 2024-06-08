package com.Calculator.App.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class CalculatorService {

    protected static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public String getAnswer(Double num1, String operator, Double num2) {
        double result = 0;
        try {

            switch (operator) {
                case "+":
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

                case "power":
                    result = Math.pow(num1, num2);
                    break;

                default:
                    return "You Entered the wrong input! ";


            }
        } catch (Exception e) {
            logger.error("Error occurred: ", e);
            return "Error on your code" + e.getMessage();
        }
        logger.info("Calculated {} {} {} = {}", num1, operator, num2, result);
        return "The result of " + num1 + " " + operator + " " + num2 + " is: " + result;
    }
}
