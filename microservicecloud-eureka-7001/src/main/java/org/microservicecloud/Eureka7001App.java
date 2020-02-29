package org.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer // 接受其他微服务注册进来
@SpringBootApplication
public class Eureka7001App {
	public static void main(String[] args) {
		SpringApplication.run(Eureka7001App.class, args);
	}
}
