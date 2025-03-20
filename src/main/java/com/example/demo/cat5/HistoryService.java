package com.example.demo.cat5;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {

    private final List<String> history = new ArrayList<>();

    public void addHistory(String operation) {
        history.add(operation);
    }

    public List<String> getHistory() {
        return history;
    }
}
