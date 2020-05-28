package com.emart.zuul;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.client.RestTemplate;

import com.emart.zuul.filter.AccessFilter;
import com.emart.zuul.util.UserContextInterceptor;

@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Client
public class ZuulServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}
	
	/**
	 * Resource filter
	 * 
	 * @return
	 */
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
	
	@Bean
	@Primary
	public RestTemplate getRestTemplate() {
		RestTemplate template = new RestTemplate();
		List<ClientHttpRequestInterceptor> interceptors = template.getInterceptors();
		if (interceptors == null) {
			interceptors = new ArrayList<ClientHttpRequestInterceptor>();
		}
		
		interceptors.add(new UserContextInterceptor());
		template.setInterceptors(interceptors);
		return template;
	}
}
