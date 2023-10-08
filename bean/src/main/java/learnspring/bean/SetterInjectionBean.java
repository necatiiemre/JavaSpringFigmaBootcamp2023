package learnspring.bean;

import org.springframework.stereotype.Component;

@Component
public class SetterInjectionBean {
	
	public void print() {
		System.out.println("I am a Setter Injection");
	}
}
