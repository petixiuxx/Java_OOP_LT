package com.person;

public class Person {
	private String name;
	private String address;
	public Person() {};
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person[name=" + this.name + "," + "address=" + this.address + "]";
	}
}
