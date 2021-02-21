package com.raaga.cmpe275.GuiceHelloWorld;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class CoolGreeter implements Greeter{
	
	private String greeter;
	
	@Inject
	public CoolGreeter(@Named("greeter") String greeter) {
		
		this.greeter=greeter;//Gets the greeter name from the annotation greeter in Greeter module
	}

	public void greet() {
		System.out.println("Hey World. Me "+greeter);
	}
}
