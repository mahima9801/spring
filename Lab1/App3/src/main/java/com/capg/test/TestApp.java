package com.capg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.beans.Sbu;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("com/capg/config/employee.xml");
		
		Sbu sbu = container.getBean("sbu",Sbu.class);
		
		System.out.println(sbu);
	
	}
}
