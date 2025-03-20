package com.example.demo.cat4;

import com.example.demo.cat5.HistoryService;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Hello, Spring Boot!";
    }

    @Service
    public static class CalculatorService {

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
}
