package com.raaga.cmpe275.GuiceHelloWorld;

import com.google.inject.Inject;
import com.google.inject.name.Named;
/**
 * Provides Warm greeting Implementation of Greeter interface.
 * @author raagapranithakolla
 *
 */
public class WarmGreeter implements Greeter{
	private String greeter;
	
	@Inject
	public WarmGreeter(@Named("greeter") String greeter) { 
		this.greeter=greeter;  //Gets the greeter name from the annotation greeter in Greeter module
	}
	
	public void greet() {
		System.out.println("Hello, my dear World. I am "+greeter+". Nice to see you!");
	}

}
