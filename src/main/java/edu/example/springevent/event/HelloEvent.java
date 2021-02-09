/**
 * 
 */
package edu.example.springevent.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author HP
 *
 */
public class HelloEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloEvent(Object source) {
		super(source);
	}
}
