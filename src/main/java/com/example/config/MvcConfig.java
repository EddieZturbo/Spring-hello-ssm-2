package com.example.config;

import com.example.interceptor.FirstInterceptor;
import com.example.interceptor.SecondInterceptor;
import com.example.interceptor.ThirdInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 @author EddieZhang
 @create 2022-11-10 13:23
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    /**
     * 配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FirstInterceptor()).addPathPatterns("/**").excludePathPatterns("/");
        registry.addInterceptor(new SecondInterceptor()).addPathPatterns("/**").excludePathPatterns("/");
        registry.addInterceptor(new ThirdInterceptor()).addPathPatterns("/**").excludePathPatterns("/");
    }

    /**
     * 配置视图处理器
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/target").setViewName("target");
        registry.addViewController("/books").setViewName("books");
    }
}
