package com.capg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.beans.Employee;

public class TestApp {

	public static void main(String[] args) {
	
		ApplicationContext container=new ClassPathXmlApplicationContext("com/capg/config/springConfig.xml");
		
		Employee employee=container.getBean("emp",Employee.class);
		
		System.out.println("Employee details");
		System.out.println("-----------------------");
		System.out.println("Employee ID :"+" "+employee.getEmployeeId());
		System.out.println("Employee Name :"+" "+employee.getEmployeeName());
		System.out.println("Employee Salary :"+" "+employee.getSalary());
		System.out.println("Employee BU :"+" "+employee.getBusinessUnit());
		System.out.println("Employee Age :"+" "+employee.getAge());
}
}
