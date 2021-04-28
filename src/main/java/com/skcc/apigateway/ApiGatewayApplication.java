package com.skcc.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.skcc.apigateway.zuul.PostZuulFilter;
import com.skcc.apigateway.zuul.PreZuulFilter;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
	@Bean
	public PreZuulFilter preFilter() {
		return new PreZuulFilter();
	}
	
    @Bean
    public PostZuulFilter postFilter() {
        return new PostZuulFilter();
    }

}
