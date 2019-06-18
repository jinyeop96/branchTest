package com.test.di05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DAO_Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:dao.xml");
		
		ServiceImpl service = ctx.getBean("service", ServiceImpl.class);
		
		service.biz();	
		
		/*
		  실행하면
		   
		 OracleDAO 생성자입니다
		 MySqlDAO 생성자입니다		
		 OracleDAO 입니다
		 
		 이렇게 출력 되는데 이유는 
		 ctx 만들어지면서 dao.xml내의 MySqlDAO도 만들기 때문에 기본 생성자 내의 메서드가 실행되어서 출려된것
		 */
	}
}
