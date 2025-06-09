package com.siva.anjuri.calculator.repository;

import com.siva.anjuri.calculator.model.CalculatorHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationHistoryRepository extends JpaRepository<CalculatorHistory, Long> {
}
