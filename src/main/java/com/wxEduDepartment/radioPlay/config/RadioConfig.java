package com.wxEduDepartment.radioPlay.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RadioConfig implements WebMvcConfigurer {
    @Value("${file.radioFolder}")
    private String basePath;


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*
         * Resources root
         * addResourceHandler: Access to mapped paths
         * addResourceLocations: Absolute paths to resources
         */
        registry.addResourceHandler("/radio/**")
                .addResourceLocations("classpath:/static/audio");
    }
}
