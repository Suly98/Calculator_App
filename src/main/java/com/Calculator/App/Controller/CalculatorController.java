package com.Calculator.App.Controller;

import com.Calculator.App.Service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptException;

@RestController
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

}
