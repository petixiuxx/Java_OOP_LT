package com.person;

public class Student extends Person{
	String program;
	int year;
	double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		// TODO Auto-generated constructor stub
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[" + super.toString() + ",program=" + this.program + ",year=" + this.year + ",fee=" + this.fee;
	}
	
}
