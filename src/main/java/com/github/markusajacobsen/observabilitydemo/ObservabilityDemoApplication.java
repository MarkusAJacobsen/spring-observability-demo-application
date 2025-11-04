package com.github.markusajacobsen.observabilitydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ConfigurationPropertiesScan
@SpringBootApplication
@EnableWebMvc
public class ObservabilityDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ObservabilityDemoApplication.class, args);
	}
}
