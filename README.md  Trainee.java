package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Trainee {
	@Id
	private int tid;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTgender() {
		return tgender;
	}
	public void setTgender(String tgender) {
		this.tgender = tgender;
	}
	public String getTtechnology() {
		return ttechnology;
	}
	public void setTtechnology(String ttechnology) {
		this.ttechnology = ttechnology;
	}
	public String getTtechno() {
		return ttechno;
	}
	public void setTtechno(String ttechno) {
		this.ttechno = ttechno;
	}
	private String tname;
	private String tgender;
	private String ttechnology;
	private String ttechno;
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainee(int tid,String tname,String tgender,String ttechno) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tgender = tgender;
		this.ttechno = ttechno;
		
		
		
	}
}
