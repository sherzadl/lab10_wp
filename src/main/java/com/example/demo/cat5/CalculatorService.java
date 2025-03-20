package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final HistoryService historyService;

    public CalculatorService(HistoryService historyService) {
        this.historyService = historyService;
    }

    public int add(int a, int b) {
        int result = a + b;
        historyService.addHistory(a + " + " + b + " = " + result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        historyService.addHistory(a + " - " + b + " = " + result);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        historyService.addHistory(a + " * " + b + " = " + result);
        return result;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double result = (double) a / b;
        historyService.addHistory(a + " / " + b + " = " + result);
        return result;
    }
}
