package com.practice.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
//@Component
public class TranslateMessageService {
	
		@Autowired
		DictionaryService di;

	 	@Value("${name:TranslateMessageService}")
		protected String tName;

	    public void setName(String name) {
			this.tName = name;
		}
	    
	    public String getDictionaryWord() {
	    	return di.getDictionaryWord();
	    }
	    
	    public void setDictionaryWord(String word) {
	    	di.setDictionaryWord(word);
	    }

/*		public String getMessage() {
	        return getMessage(tName);
	    }

	    public String getMessage(String name) {
	        return "Hello " + name + " ";
	    }*/
}
