package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    private final AppConfig appConfig;

    public ConfigController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping
    public String showConfig() {
        return "App Name: " + appConfig.getAppName() +
                ", Version: " + appConfig.getAppVersion() +
                ", Description: " + appConfig.getAppDescription();
    }
}
