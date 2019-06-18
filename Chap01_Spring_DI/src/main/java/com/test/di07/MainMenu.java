package com.test.di07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainMenu {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:map.xml");
		
		MapTest mapTest = ctx.getBean("map", MapTest.class);
		
		mapTest.prn();
		
		ctx.close();
	}
}
