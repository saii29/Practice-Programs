package com.practice.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class DictionaryService {
	
	private String word = "dictionary";
	
	public String getDictionaryWord() {
		return word;
	}

	public void setDictionaryWord(String word2) {
		this.word = word2;
	}

}
