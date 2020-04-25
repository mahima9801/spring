package com.capg.beans;

import java.util.List;

public class EmployeeList extends Employee{

	

	public EmployeeList(int employeeId, String employeeName, double salary) {
		super(employeeId, employeeName, salary);
	}

	List<Employee> emplist;

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	@Override
	public String toString() {
		return "EmployeeList [emplist=" + emplist + "]";
	}
	
	
	
}
