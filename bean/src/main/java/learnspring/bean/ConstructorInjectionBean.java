package learnspring.bean;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {
	
	public void print() {
		System.out.println("I am a Constructor Injection Bean");
	}
}
