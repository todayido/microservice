package com.nacos.provider.demo;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@NacosConfigurationProperties(dataId = "springboot-nacos-provider", autoRefreshed = true)
public class DemoNacosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoNacosApplication.class, args);
	}

	@GetMapping("/helloNacos")
	public String helloNacos(){
		return "你好，nacos！";
	}

}
