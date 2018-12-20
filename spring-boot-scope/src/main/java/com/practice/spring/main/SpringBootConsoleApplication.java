package com.practice.spring.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.practice.spring.scope.HelloMessageService;

@ComponentScan("com.practice.spring.*")
@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

	@Autowired
	private HelloMessageService helloService;

	@Autowired
	private HelloMessageService helloService1;

	public static void main(String[] args) throws Exception {

		SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(helloService.getMessage("ff") + helloService.hashCode());
		System.out.println(helloService1.getMessage() + helloService1.hashCode());
		System.out.println(helloService == helloService1);
		helloService.setName("one");
		System.out.println(helloService.getMessage());
		System.out.println(helloService.getTMessage());
		System.out.println(helloService1.getMessage());
		System.out.println(helloService1.getTMessage());

		System.out.println(helloService.getDictionaryWord());
		System.out.println(helloService1.getDictionaryWord());

		helloService.setDictionaryWord("new");
		System.out.println(helloService.getDictionaryWord());
		System.out.println(helloService1.getDictionaryWord());

	}
/*
	@Scope("prototype")
	@Bean
	public HelloMessageService gethelloService() {
		return new HelloMessageService();
	}
*/
	// @Scope("prototype")
/*
	@Bean
	public TranslateMessageService gettranslateService() {
		return new TranslateMessageService();
	}
*/
}