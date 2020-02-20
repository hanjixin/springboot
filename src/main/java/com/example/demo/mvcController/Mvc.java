package com.example.demo.mvcController;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Configuration
public class Mvc implements WebMvcConfigurer {
    // 重写config
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 添加视图跳转
        registry.addViewController("/form").setViewName("form");
    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {

    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 消息处理器
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截器 并去除不拦截路径
        registry.addInterceptor(new Interceptor()).excludePathPatterns("/hello2");
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new Formatter<Date>() {
            @Override
            public String print(Date date, Locale locale) {
                return  null;
            }
            @Override
            public Date parse(String s, Locale locale) throws ParseException {
                return  new SimpleDateFormat("yyyy-MM-dd").parse(s);
            }
        });
    }
}
