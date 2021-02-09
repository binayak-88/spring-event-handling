package edu.example.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.example.springevent.event.HelloEvent;
import edu.example.springevent.event.HelloEventPublisher;
import edu.example.springevent.event.HelloEventSource;

@SpringBootApplication
public class SpringEventHandlingApplication {

	@Autowired
	HelloEventPublisher eventPublisher;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringEventHandlingApplication.class, args);
		HelloEventPublisher eventAPublisher = (HelloEventPublisher)context.getBean("helloEventPublisher");
		for(int i=0; i<10 ; i++) {
			eventAPublisher.publish(new HelloEvent(new HelloEventSource("Hello World Event Raised")));	
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
			
	}
}