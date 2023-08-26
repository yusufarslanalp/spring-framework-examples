package com.example.httpClient;

import model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class HttpClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpClientApplication.class, args);
	}

	@GetMapping("/restTemplate")
	public String greet(  ){
		RestTemplate restTemplate = new RestTemplate();
		String s = restTemplate.getForObject("http://localhost:8081/greet", String.class);
		return s + " from http clint project";
	}

	@GetMapping("/getProduct")
	public Product getProduct(  ){
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8081/product", Product.class);
		return product;
	}
}
