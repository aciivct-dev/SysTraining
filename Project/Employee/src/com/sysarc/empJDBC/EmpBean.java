 package com.sysarc.empJDBC;

public class EmpBean {
	private String name;
	private String mail;
	private long num;
	private String job;
	private String pass;
	
	public EmpBean() {
	}

	public EmpBean(String name, String mail, long num, String job, String pass) {
		this.name = name;
		this.mail = mail;
		this.num = num;
		this.job = job;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
