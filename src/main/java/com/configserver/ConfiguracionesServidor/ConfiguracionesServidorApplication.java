package com.configserver.ConfiguracionesServidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfiguracionesServidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfiguracionesServidorApplication.class, args);
	}
}
