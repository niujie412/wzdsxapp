package com.niu;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter{

//    @Value("${spring.http.multipart.location}")
//    private String loaction;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("static/**").addResourceLocations("classpath:/static/images/upload");
        super.addResourceHandlers(registry);
    }
//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        factory.setMaxFileSize("2MB");
//        factory.setMaxRequestSize("10MB");
//        factory.setLocation(loaction);
//        return factory.createMultipartConfig();
//    }
}
