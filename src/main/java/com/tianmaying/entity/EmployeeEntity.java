package com.tianmaying.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity extends BaseEntity {
	
	//员工号
	private String empId;
	//用户名
	private String name;
	//职位
	private String title;
	//性别 0: 女 1: 男 2:其他
	private int sex;
	//电话
	private String tel;
	//密码
	private String password;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
