package com.siri.chandana.calculator.strategy.impl;

import com.siri.chandana.calculator.model.Operation;
import com.siri.chandana.calculator.strategy.OperationStrategy;
import org.springframework.stereotype.Component;

@Component
public class AddOperationImpl implements OperationStrategy {
    public Operation getOperationType() {
        return Operation.ADD;
    }

    public double apply(double a, double b) {
        return a + b;
    }
}
