package com.test.di;

public class GetSum {
	private int aa;
	private int bb;
	
	public int getAa() {
		return aa;
	}
	public void setAa(int aa) {
		this.aa = aa;
	}
	public int getBb() {
		return bb;
	}
	public void setBb(int bb) {
		this.bb = bb;
	}
	
	// 핵심로직
	public void sum(int aa, int bb) {
		System.out.println("더하기 예제");
		int result = aa + bb;
		System.out.println("합 ==> " + result);
	}
}
