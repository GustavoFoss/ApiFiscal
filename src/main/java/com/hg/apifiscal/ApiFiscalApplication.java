package com.hg.apifiscal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ApiFiscalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFiscalApplication.class, args);
	}

}
