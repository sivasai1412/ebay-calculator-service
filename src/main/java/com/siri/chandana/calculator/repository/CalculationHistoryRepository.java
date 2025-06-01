package com.siri.chandana.calculator.repository;

import com.siri.chandana.calculator.model.CalculatorHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationHistoryRepository extends JpaRepository<CalculatorHistory, Long> {
}
