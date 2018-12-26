package com.practice.spring.scopeabstract;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.practice.spring.model.Message;

//@Component
//@Scope("prototype")
public abstract class MessageService {
	
	
	protected Message message;
	
	public abstract Message getMessage();

	public void init(Message message) {
		this.message = message;
	}

}
