package com.kishori.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@ Table(name="Student")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int rollno;
@Column(name="Name")
private String name;

@Column(name="Address")
private String address;

@Column(name="Mobile_no")
private long mobile_no;

@Column(name="Percentage")
private float percentage;

public Student() {
	
}

public Student(int rollno, String name, String address, long mobile_no, float percentage) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.address = address;
	this.mobile_no = mobile_no;
	this.percentage = percentage;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getMobile_no() {
	return mobile_no;
}

public void setMobile_no(long mobile_no) {
	this.mobile_no = mobile_no;
}

public float getPercentage() {
	return percentage;
}

public void setPercentage(float percentage) {
	this.percentage = percentage;
}




}
