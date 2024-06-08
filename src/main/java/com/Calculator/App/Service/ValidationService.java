package com.Calculator.App.Service;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {
    public Boolean isValidOperator(String operator){
        return operator.matches("[+/*%-^]");
    }

    public Boolean isValidNum(Double number){

    }
}
