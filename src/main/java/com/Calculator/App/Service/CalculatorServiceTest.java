package com.Calculator.App.Service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAddition(){
        assertEquals("Result of 5.0 - 3.0 = 2.0", calculatorService.getAnswer(5.0,"-", 3.0));

    }
}
