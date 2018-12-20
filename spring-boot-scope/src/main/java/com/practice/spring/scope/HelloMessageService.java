package com.practice.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Scope("prototype")
@Service
public class HelloMessageService extends TranslateMessageService {

    @Value("${name:HelloMessageService}")
    private String name;

    public String getMessage() {
        return getMessage(name);
    }

    public String getTMessage() {
        return getMessage(tName);
    }
    
    public String getMessage(String name) {
        return "Hello " + name + " ";
    }

}
