package com.nacos.consumer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients
public class DemoNacosConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoNacosConsumerApplication.class, args);
	}


	@Autowired
	private RemoteClient remoteClient;

	@RequestMapping("/feign")
	public String test() {
		return remoteClient.helloNacos();
	}

}
