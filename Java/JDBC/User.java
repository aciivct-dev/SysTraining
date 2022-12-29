package com.sysarc.user;

public class User 
{
	private String name;
	private String dept;
	private int sal;
	private String date;
	private int uid;
	private String pass;
	private String mail;
	
	public User()
	{}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
	public String userDetails()
	{
		return "User ID:"+uid+"\nName:"+name+"\nDepartment:"+dept+"\nSalary:"+sal+"\nJoining Date:"+date;
	}
	public String logCredentials()
	{
		return "UserID:"+uid+"\nPassword:"+pass;
	}
}
