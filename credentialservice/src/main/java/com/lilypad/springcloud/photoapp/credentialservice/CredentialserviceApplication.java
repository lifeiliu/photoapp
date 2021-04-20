package com.lilypad.springcloud.photoapp.credentialservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CredentialserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CredentialserviceApplication.class, args);
	}

}
