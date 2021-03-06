package br.com.demo.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@SpringBootApplication
public class SpringBatchDemoOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchDemoOneApplication.class, args);
	}

}
