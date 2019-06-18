package com.test.di04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarTester {

	public static void main(String[] args) {
		// car.xml 파일을 읽어들여서 스프링 컨테이너를 생성
		// bean이 만들어진다  = 객체로 생성이 된다 = 메모리로 로딩이 된다
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:car.xml");
		
		// 위에서 car.xml 내의 클래스들이 객체화 되었으니까 그 중 id로 찾아내서 가져온다
		// -> 스프링 컨테이너에서 bean(객체)를 가져온다  - 주입(DI)
		Car car = ctx.getBean("car", Car.class);
		
		car.drive();
		
		// 해당 어플리케이션을 종료시 스프링 컨테이너에 존재하는 모든 bean(객체)를 종료
		ctx.close();

	}

}
