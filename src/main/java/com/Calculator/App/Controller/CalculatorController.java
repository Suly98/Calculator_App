package com.Calculator.App.Controller;

import com.Calculator.App.Service.CalculatorService;
import com.Calculator.App.Service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptException;

@RestController
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @Autowired
    ValidationService validationService;

    @GetMapping("calc")
    public String getAnswer(@RequestParam Double num1, String operator, Double num2){
        //to return a true number
        if(!validationService.isValidNum(num1) || (num2 != null && !validationService.isValidNum(num2))){
            return "Invalid input number";
        }
        if(!validationService.isValidOperator(operator)){
            return "Invalid input for operator";
        }

        return calculatorService.getAnswer(num1,operator, num2);
    }
}
