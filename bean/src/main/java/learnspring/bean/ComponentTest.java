package learnspring.bean;

import org.springframework.stereotype.Component;

@Component
public class ComponentTest {

	public void print() {
		System.out.println("I am using @Component");
	}
}
