package com.mtn.todo_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow all endpoints to accept requests from frontend running on localhost:3000
        registry.addMapping("/**")
                .allowedOrigins("https://todo-task-ecru-pi.vercel.app/")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true);  // If necessary, adjust this according to your requirements
    }

}
