package SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = FormController.class)
public class Execution {
	public static void main(String[] args) {
		SpringApplication.run(Execution.class, args);
	}
}
