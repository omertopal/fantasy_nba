package org.nba.players;


import java.util.Arrays;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableAutoConfiguration
public class MyApplication {  
	
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
    }   
	
	@Bean
    public FilterRegistrationBean simpleCorsFilter() {  
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
        CorsConfiguration config = new CorsConfiguration();  
        config.setAllowCredentials(true); 
        // *** URL below needs to match the Vue client URL and port ***
        config.setAllowedOrigins(Collections.singletonList("*")); 
        config.setAllowedMethods(Collections.singletonList("*"));  
        config.setAllowedHeaders(Collections.singletonList("*"));
        config.setExposedHeaders(Arrays.asList("Access-Control-Allow-Headers", "Authorization, x-xsrf-token, access_token, refresh_token, user_name_surname, user_title, Access-Control-Allow-Headers, Origin, Accept, X-Requested-With, " +
                "Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers"));
        	
        source.registerCorsConfiguration("/**", config);  
        FilterRegistrationBean bean = new FilterRegistrationBean<>(new CorsFilter(source));
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);  
        return bean;  
    }  
} 

