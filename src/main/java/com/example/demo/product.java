package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class product {

	private int pid;
	private String pname;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String string) {
		this.pname = string;
	}
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + "]";
	}
}
