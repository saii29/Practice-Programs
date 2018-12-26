package com.practice.spring.scopeabstract;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.practice.spring.model.Message;

@Qualifier("msgOne")
@Component
public class MsgOneService extends MessageService {

	@Override
	public Message getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
	@Override
	public void init(Message message) {
		// TODO Auto-generated method stub
//		me
		super.init(message);
	}
	
	
	
	
	
	
}
