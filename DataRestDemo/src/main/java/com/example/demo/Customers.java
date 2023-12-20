package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customers {
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private String courename;
	
	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getCourename() {
		return courename;
	}
	
	public void setCourename(String courename) {
		this.courename = courename;
	}

	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", courename=" + courename + "]";
	}

}
