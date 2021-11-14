package com.santhosh.springannotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("10")
	private int dno;
	@Value("hyderabad")
	private String city;
	@Value("500059")
	private int pinCode;
	public Address()
	{}
	public Address(int dno, String city, int pinCode) {
		super();
		this.dno = dno;
		this.city = city;
		this.pinCode = pinCode;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", city=" + city + ", pinCode=" + pinCode + ", getDno()=" + getDno()
				+ ", getCity()=" + getCity() + ", getPinCode()=" + getPinCode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
