package com.practice.spring.scopeabstract;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.practice.spring.model.Message;

@Qualifier("msgTwo")
@Component
public class MsgTwoService extends MessageService {

	@Override
	public Message getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
