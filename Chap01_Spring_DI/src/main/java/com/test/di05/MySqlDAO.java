package com.test.di05;

public class MySqlDAO implements DAO{
	@Override
	public void add() {
		System.out.println("MySqlDAO 입니다");
	}
	
	public MySqlDAO() {
		System.out.println("MySqlDAO 생성자입니다");
	}
}
