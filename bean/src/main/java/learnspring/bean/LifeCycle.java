package learnspring.bean;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifeCycle {
	
	@PostConstruct
	public void init() {
		System.out.println("I am in init");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("I am in destroy");
	}
	
	
	public LifeCycle() {
		super();
		System.out.println("I am in Constructor");
	}
	
	public void print() {
		System.out.println("I am in print function");
	}
	
	
}
