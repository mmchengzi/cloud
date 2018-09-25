package com.zjc.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * User zjc
 * Created with IntelliJ IDEA
 * Created on 2018-09-10 10:32
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication{

		public static void main(String[] args) {
			SpringApplication.run(EurekaApplication.class, args);
		}
}
