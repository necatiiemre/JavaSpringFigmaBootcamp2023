package learnspring.bean;

import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBean {
	
	public void print() {
		System.out.println("I am a Field Injection Bean");
	}
}
