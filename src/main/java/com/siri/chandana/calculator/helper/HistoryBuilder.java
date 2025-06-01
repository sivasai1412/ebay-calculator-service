package com.siri.chandana.calculator.helper;

import com.siri.chandana.calculator.model.CalculatorHistory;
import com.siri.chandana.calculator.model.Operation;

import java.time.LocalDateTime;

public class HistoryBuilder {
    public static CalculatorHistory build(Operation operation,
                                          double a, double b, double result) {
        CalculatorHistory history = new CalculatorHistory();
        history.setNumber1(a);
        history.setNumber2(b);
        history.setOperation(operation);
        history.setResult(result);
        history.setTimeStamp(LocalDateTime.now());
        return history;
    }
}
