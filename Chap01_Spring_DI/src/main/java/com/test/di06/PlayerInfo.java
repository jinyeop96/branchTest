package com.test.di06;

public class PlayerInfo {
	private Player player;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public void prn() {
		System.out.println("선수 이름 : " + player.getName());
		System.out.println("선수 나이 : " + player.getAge());
		System.out.println("선수 포지션 : " + player.getPosition());
		System.out.println("선수 키 : " + player.getHeight());
		System.out.println("선수 몸무게 : " + player.getWeight());
		System.out.println("::::::::::::::::::::::::::::::::::::::");
	}
	
}
