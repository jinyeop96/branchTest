package com.test.di;

public class MyGetSum {
	GetSum getsum;    // MyGetSum 클래스가 GetSum이라는 클래스를 포함하는 구조
	private int a;
	private int b;
	
	
	public void sum() {
		getsum.sum(a, b);
	}
	
	public void setGetsum(GetSum getsum) {
		this.getsum = getsum;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
