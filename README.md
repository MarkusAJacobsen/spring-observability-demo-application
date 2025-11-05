# Spring Obervability Demo Application

A project displaying the capabilities of Micrometer's auto-instrumentation.
The repository is structured in a step-by-step manner using branches. 

* **master** - Contains the complete project

Step-by-step branches:
* **initial** - Base spring project with a simple controller and service structure that returns a dummy object
* **add-observability** - Adds the Micrometer and Actuator dependencies allowing for the extraction of JVM related data
* **add-webflux** - Replaces the dummy return object with a connector to Weather API for retrieving current weather by city
* **add-database** - Adds JPA and saves the location-part of the weather data
* **add-misc** - Adds Spring Security, Resilience4j Circuit Breaker, and Caffeine Cache
