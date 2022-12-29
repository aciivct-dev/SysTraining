package com.example.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apply {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String dob;
	private String address;
	private Integer age;
	private String gender;
	private String email;
	private String mobile;
	private String aadhar_no;
	private String pancard;
	private Long amount_req;
	private String house_type;
	private String employee_type;
	
	public Apply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apply(Integer id, String name, String dob, String address, Integer age, String gender, String email,
			String mobile, String aadhar_no, String pancard, Long amount_req, String house_type, String employee_type) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.aadhar_no = aadhar_no;
		this.pancard = pancard;
		this.amount_req = amount_req;
		this.house_type = house_type;
		this.employee_type = employee_type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public Long getAmount_req() {
		return amount_req;
	}

	public void setAmount_req(Long amount_req) {
		this.amount_req = amount_req;
	}

	public String getHouse_type() {
		return house_type;
	}

	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}

	public String getEmployee_type() {
		return employee_type;
	}

	public void setEmployee_type(String employee_type) {
		this.employee_type = employee_type;
	}
	
	
}
