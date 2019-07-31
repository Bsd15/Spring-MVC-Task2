package com.stackroute.springmvctask2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.stackroute.springmvctask2")
public class SpringMVNTask2Config {
	// define a bean for ViewResolver
	 
		@Bean
		public ViewResolver viewResolver() {
			
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
			
			viewResolver.setPrefix("/WEB-INF/views/");
			viewResolver.setSuffix(".jsp");
			
			return viewResolver;
		}
}
