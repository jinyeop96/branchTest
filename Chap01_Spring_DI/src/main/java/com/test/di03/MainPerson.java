package com.test.di03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainPerson {
	

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:person.xml");
		
		PersonInfo info = ctx.getBean("info", PersonInfo.class);
		info.getPersonInfo();
		
		Person per = ctx.getBean("person2", Person.class);
		info.setPerson(per);
		info.getPersonInfo();
	
		
	}
	
}
