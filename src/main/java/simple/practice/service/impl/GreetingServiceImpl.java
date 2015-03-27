package simple.practice.service.impl;

import org.springframework.stereotype.Component;

import simple.practice.service.GreetingService;

@Component
public class GreetingServiceImpl implements GreetingService{

	@Override
	public String greetingMessage() {
		return "Yo! What's up man. ";
	}

}
