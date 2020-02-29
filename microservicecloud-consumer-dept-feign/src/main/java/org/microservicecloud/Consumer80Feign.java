package org.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = { "com.chenjiangyun.microservicecloud" })
@ComponentScan(basePackages = { "org.microservicecloud", "com.chenjiangyun.microservicecloud" })
public class Consumer80Feign {
	public static void main(String[] args) {
		SpringApplication.run(Consumer80Feign.class, args);
	}
}
