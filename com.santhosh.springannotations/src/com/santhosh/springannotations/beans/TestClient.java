package com.santhosh.springannotations.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=context.getBean(Employee.class);
		System.out.print(emp);
		
	}
}
