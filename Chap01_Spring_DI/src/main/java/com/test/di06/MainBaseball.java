package com.test.di06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBaseball {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:baseball.xml");
		PlayerInfo player1 = ctx.getBean("playerinfo1", PlayerInfo.class);
		Player player2 = ctx.getBean("player2", Player.class);
		player1.prn();
		
		System.out.println("선수 이름 : " + player2.getName());
		System.out.println("선수 나이 : " + player2.getAge());
		System.out.println("선수 포지션 : " + player2.getPosition());
		System.out.println("선수 키 : " + player2.getHeight());
		System.out.println("선수 몸무게 : " + player2.getWeight());
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
		
		
		ctx.close();

	}

}
