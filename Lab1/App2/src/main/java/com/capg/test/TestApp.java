package com.capg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.beans.Employee;
import com.capg.beans.Sbu;

public class TestApp {
	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("com/capg/config/employeeconfig.xml");
		
		Employee employee=container.getBean("emp",Employee.class);
		Sbu sbu = container.getBean("sbu",Sbu.class);
		
		System.out.println(sbu);
		System.out.println(employee);
		
		
	}
}
