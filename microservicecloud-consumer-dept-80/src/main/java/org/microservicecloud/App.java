package org.microservicecloud;

import org.microservice.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "microservicecloud-dept", configuration = MySelfRule.class)
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
