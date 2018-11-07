package com.zjc.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * User zjc
 * Created with IntelliJ IDEA
 * Created on 2018-09-10 10:32
 */
@SpringBootApplication
@EnableEurekaServer
@EnableScheduling
public class EurekaApplication{

		public static void main(String[] args) {
			SpringApplication.run(EurekaApplication.class, args);
		}
}
