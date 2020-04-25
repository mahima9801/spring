package com.capg.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.beans.Employee;
import com.capg.beans.EmployeeList;

public class TestApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext container = new ClassPathXmlApplicationContext("com/capg/config/empconfig.xml");
		EmployeeList empl = container.getBean("list",EmployeeList.class);
		
		System.out.println("Enter the Employee Id");
		int eid=sc.nextInt();
		
		System.out.println("Employee Details");
		for(int i=0;i<empl.getEmplist().size();) {
			Employee emp=empl.getEmplist().get(i);
			if(emp.getEmployeeId()==(eid))
			{
				System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+emp.getSalary());
				break;
			}
			else
			{
				break;
			}
		}
		
		}
		
	}

