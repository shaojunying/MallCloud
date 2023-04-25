package com.shao.mallcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MallcloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallcloudConfigApplication.class, args);
    }

}
