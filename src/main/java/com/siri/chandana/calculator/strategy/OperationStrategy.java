package com.siri.chandana.calculator.strategy;

import com.siri.chandana.calculator.model.Operation;

public interface OperationStrategy {
    Operation getOperationType();
    double apply(double a, double b);
}
