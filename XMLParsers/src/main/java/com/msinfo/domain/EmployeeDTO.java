package com.msinfo.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Employee")
@XmlType(propOrder = { "name", "age", "role", "gender" })
public class EmployeeDTO {

	private int id;

	private String gender;
	private int age;
	private String name;
	private String role;

	private String password;

	@XmlTransient
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@XmlAttribute(name = "Id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	@XmlElement(name = "Age")
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@XmlElement(name = "Employee_Name")
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	@XmlElement(name = "Gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	@XmlElement(name = "Role")
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "ID = " + id + " NAME=" + name + " AGE=" + age + " GENDER=" + gender + " ROLE=" + role + " PASSWORD="
				+ password;
	}
}
