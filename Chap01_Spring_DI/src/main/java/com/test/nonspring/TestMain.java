package com.test.nonspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public void name() {
		// TestDAO dao = new TestDAOImpl();
		// dao.printMsg();
		//String configloc = "classpath:test.xml";
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test.xml");
		TestDAO dao = (TestDAO)ctx.getBean("daoImpl", TestDAOImpl.class);
		
		dao.printMsg();
		
	}
}
