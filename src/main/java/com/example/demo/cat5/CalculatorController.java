package com.example.demo.cat5;

import com.example.demo.cat4.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    private final GreetingService.CalculatorService calculatorService;
    private final HistoryService historyService;

    public CalculatorController(GreetingService.CalculatorService calculatorService, HistoryService historyService) {
        this.calculatorService = calculatorService;
        this.historyService = historyService;
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b) {
        return calculatorService.divide(a, b);
    }

    @GetMapping("/history")
    public List<String> getHistory() {
        return historyService.getHistory();
    }
}
