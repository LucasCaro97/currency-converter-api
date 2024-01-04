package com.converter.CurrencyConverter.Config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@org.springframework.context.annotation.Configuration
public class Configuration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/currency/getAll")
                .allowedOrigins("http://200.58.107.39:5173")
                .allowedMethods("GET");
    }
}
