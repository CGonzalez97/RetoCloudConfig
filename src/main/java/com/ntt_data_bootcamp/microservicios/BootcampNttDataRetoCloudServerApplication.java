package com.ntt_data_bootcamp.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootcampNttDataRetoCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampNttDataRetoCloudServerApplication.class, args);
	}

}
