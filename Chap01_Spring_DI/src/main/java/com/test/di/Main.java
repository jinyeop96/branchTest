package com.test.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// DI 즉 주입을 어떻게 할 것인지 xml 문서에 기입이 되어 있음
		// 스프링 컨테이너 ctx가 configLoc를 보고 DI를 수행한다
		// getsum.xml 파일은 리소스 폴더에 있어야 함
		String configLoc = "classpath:getsum.xml";
		// DI 작업을 해주는 스프링 객체
		// xml 파일을 이용해서 Spring Container 를 생성한다
		// xml에 설정되어 있는 그대로 bean 이라고 불리는 객체를 만든다(메모리로 로딩)
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configLoc);
		
		// 주입 과정이 진행됨
		// new 키워드를 써서 MyGetSum 이라는 객체를 main 메서드에서 직접 만드는 것이 아니라 스프링 컨테이너에서 꺼내서 사용함
		// 스프링 컨테이너에서 필요한 MyGetSum 객체를 하나 끄집어 내어 주입을 진행
		// MyGetSum의 클래스 타입을 직접 명시를 해 주어야 함
		// -> MyGetSum getSum = new MyGetSum();   *(아래와 같은 동작)
		MyGetSum getSum = ctx.getBean("mySum", MyGetSum.class);
		getSum.sum();

	}

}
