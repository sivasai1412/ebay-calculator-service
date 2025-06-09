package com.siva.anjuri.calculator.strategy.impl;

import com.siva.anjuri.calculator.model.Operation;
import com.siva.anjuri.calculator.strategy.OperationStrategy;
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
