package com.capg.beans;
import java.util.List;
public class Sbu {
	private String sbuCode;
	private String sbuHead;
	private String sbuName;
	List<Employee> emplist;
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
	@Override
	public String toString() {
		return "Sbu [sbuCode=" + sbuCode + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName + ", emplist=" + emplist
				+ "]";
	}}
