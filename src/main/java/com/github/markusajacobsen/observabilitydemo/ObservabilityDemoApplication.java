package com.github.markusajacobsen.observabilitydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ObservabilityDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ObservabilityDemoApplication.class, args);
	}
}
