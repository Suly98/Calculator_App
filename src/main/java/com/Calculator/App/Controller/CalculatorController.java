package com.Calculator.App.Controller;

import com.Calculator.App.Service.CalculatorService;
import com.Calculator.App.Service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
//TODO: Needs to have a common controller prefix
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @Autowired
    ValidationService validationService;

    @GetMapping("calc") //TODO: Path does not show what it does
    public String getAnswer(@RequestParam Double num1, String operator, Double num2) {
        //to return a true number //TODO: Try optimizing below condition to reduce code repetition
        if (!validationService.isValidNum(num1) || (num2 != null && !validationService.isValidNum(num2))) {
            return "Invalid input number"; //TODO: Try exception handling with REST controllers, implement customer exception classes of your own
        }
        if (!validationService.isValidOperator(operator)) {
            return "Invalid input for operator";
        }

        return calculatorService.getAnswer(num1, operator, num2);
    }
}
