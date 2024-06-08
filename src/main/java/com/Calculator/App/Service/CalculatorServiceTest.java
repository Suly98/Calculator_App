package com.Calculator.App.Service;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();


    public void testAddition(){
        assertEquals("Result of 5.0 - 3.0 = 2.0", calculatorService.getAnswer(5.0,"-", 3.0));

    }
}
