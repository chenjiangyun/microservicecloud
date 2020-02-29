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
public class Eureka7002App {
	public static void main(String[] args) {
		SpringApplication.run(Eureka7002App.class, args);
	}
}
