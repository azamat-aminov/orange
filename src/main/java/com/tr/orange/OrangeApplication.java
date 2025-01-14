package com.tr.orange;

import com.tr.orange.logger.DefaultLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrangeApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(OrangeApplication.class, args);
		DefaultLogger.writeLogs();
	}

}
