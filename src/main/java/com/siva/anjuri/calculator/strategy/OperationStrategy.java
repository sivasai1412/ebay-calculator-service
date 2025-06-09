package com.siva.anjuri.calculator.strategy;

import com.siva.anjuri.calculator.model.Operation;

public interface OperationStrategy {
    Operation getOperationType();
    double apply(double a, double b);
}
