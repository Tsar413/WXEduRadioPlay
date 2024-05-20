package com.wxEduDepartment.radioPlay.config;

import com.wxEduDepartment.radioPlay.utils.WebInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);
    }

    @Autowired
    private WebInterceptor webInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(webInterceptor)
                .addPathPatterns("/**") // 拦截所有请求
                .excludePathPatterns("/index")
                .excludePathPatterns("/index?**")
                .excludePathPatterns("/images/**")
                .excludePathPatterns("/**/*.js")
                .excludePathPatterns("/audio/**")
                .excludePathPatterns("/**/*.css")
                .excludePathPatterns("/radioTest")
                .excludePathPatterns("/radioTest?**")
                .excludePathPatterns("/hello");
    }
}
