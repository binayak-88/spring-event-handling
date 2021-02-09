/**
 * 
 */
package edu.example.springevent.event;

/**
 * @author HP
 *
 */
public class HelloEventSource {
	private String helloNotes = "Hello World";
	
	public HelloEventSource(String helloNotes) {
		this.helloNotes = helloNotes;
	}
	 
    public String getHelloNotes() {
        return helloNotes;
    }
}