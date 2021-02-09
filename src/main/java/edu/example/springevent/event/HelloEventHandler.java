/**
 * 
 */
package edu.example.springevent.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author HP
 *
 */

@Component
public class HelloEventHandler implements ApplicationListener<HelloEvent>{

	@Override
	public void onApplicationEvent(HelloEvent event) {
		Object source = event.getSource();
        if(source instanceof HelloEventSource) {
            HelloEventSource es = (HelloEventSource)source;
            System.out.println("Event received :"+es.getHelloNotes());
        }	
	}
}