package br.com.devpaulosouza.notificationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class NotificationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServerApplication.class, args);
	}

}
