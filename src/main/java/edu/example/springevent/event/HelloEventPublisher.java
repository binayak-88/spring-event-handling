/**
 * 
 */
package edu.example.springevent.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author HP
 *
 */
@Component
public class HelloEventPublisher implements ApplicationEventPublisherAware{
	
	private ApplicationEventPublisher applicationEventPublisher;

	@Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
 
    public void publish(HelloEvent helloEvent) {
        this.applicationEventPublisher.publishEvent(helloEvent);
    }
}