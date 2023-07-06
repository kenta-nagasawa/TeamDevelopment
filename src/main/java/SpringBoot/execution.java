package SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = formController.class)
public class execution {
	public static void main(String[] args) {
		SpringApplication.run(execution.class, args);
	}
}
