package learnspring.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(BeanApplication.class, args);
		
		DependencyInjectionTest dependencyInjectionTest = context.getBean(DependencyInjectionTest.class);
		
		dependencyInjectionTest.print();
	}

}
