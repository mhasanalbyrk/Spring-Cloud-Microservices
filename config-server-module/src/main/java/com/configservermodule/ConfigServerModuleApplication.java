package com.configservermodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerModuleApplication.class, args);
    }

}
