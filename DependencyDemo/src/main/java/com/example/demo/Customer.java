package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Customer {

	private int cusid;
	private String custname;
	private String coursename;
	@Autowired
	private Technologies techdetail;
	public Technologies getTechdetail() {
		return techdetail;
	}
	public void setTechdetail(Technologies techdetail) {
		this.techdetail = techdetail;
	}
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public void display()
	{
		System.out.println("Customer Object Returned Successfully");
		techdetail.tech();
	}
	}


