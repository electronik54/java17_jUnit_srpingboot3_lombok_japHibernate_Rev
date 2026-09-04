package com.electronik54.revision_3.springboot.ch197_spring_aop_advice_types.solution;

import org.springframework.stereotype.Service;

/** Target for the advice type demo. */
@Service
public class CalculatorService {

    public int divide(int a, int b) {
        return a / b; // throws ArithmeticException when b == 0
    }
}