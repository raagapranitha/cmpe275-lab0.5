package com.raaga.cmpe275.GuiceHelloWorld;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Greeter Module for dependency injection
 * @author raagapranithakolla
 *
 */

public class GreeterModule extends AbstractModule{
	
	
		   @Override
		   protected void configure() {
		      bind(Greeter.class).annotatedWith(Names.named("CoolGreeter")).to(CoolGreeter.class); //binds CoolGreeterClass
		      bind(Greeter.class).annotatedWith(Names.named("WarmGreeter")).to(WarmGreeter.class); //binds WarmGreeterClass
		      bind(String.class).annotatedWith(Names.named("greeter")).toInstance("Raaga"); //binds greeter name
		   }    


}
