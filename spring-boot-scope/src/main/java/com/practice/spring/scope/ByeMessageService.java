package com.practice.spring.scope;

import org.springframework.beans.factory.annotation.Value;


public class ByeMessageService {
	
	 	@Value("${name:ByeMessageService}")
	    private String name;

	    public String getMessage() {
	        return getMessage(name);
	    }

	    public String getMessage(String name) {
	        return "Hello " + name + " ";
	    }

}
