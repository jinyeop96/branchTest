package com.test.di03;

public class PersonInfo {
	private Person person;
	
	public PersonInfo() {	}

	public PersonInfo(Person person) {
		this.person = person;
	} //인자 생성자
	
	public void getPersonInfo() {
		if(person != null) {
			System.out.println("name => " + person.getName());
			System.out.println("gender => " + person.getGender());
			System.out.println("age => " + person.getAge());
			System.out.println("idNo => " + person.getIdNo());
			System.out.println(":::::::::::::::::::::::::::::::::");
		}
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
