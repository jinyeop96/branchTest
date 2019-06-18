package com.test.di05;

public class OracleDAO implements DAO {

	@Override
	public void add() {
		System.out.println("OracleDAO 입니다");
	}
	
	public OracleDAO() {
		System.out.println("OracleDAO 생성자입니다");
	}

}
