package com.test.di02;

public class ExamDao {
	private String msg;
	
	public ExamDao() {	}
	
	public ExamDao(String msg) {
		this.msg = msg;
	}	// 인자 생성자.
	
	public void output() {
		System.out.println("msg ==> " + msg);
	}
	
}
