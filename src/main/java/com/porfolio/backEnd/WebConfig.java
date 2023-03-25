package com.porfolio.backEnd;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc

@Configuration

public class WebConfig implements WebMvcConfigurer {
    @Override

    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
        .maxAge(168000)
        .allowedHeaders("*")
        .allowCredentials(true);

    }
}
