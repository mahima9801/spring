package com.capg.beans;

public class Sbu{
	private String sbucode;
	private String sbuName;
	private String sbuHead;
	
	
	public String getSbucode() {
		return sbucode;
	}


	public void setSbucode(String sbucode) {
		this.sbucode = sbucode;
	}


	public String getSbuName() {
		return sbuName;
	}


	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}


	public String getSbuHead() {
		return sbuHead;
	}


	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}


	@Override
	public String toString() {
		return "Sbu [sbucode=" + sbucode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
	
}
