package com.multithreading.example;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private double basicSalaryPerDay;
	private int noOfWorkingdays;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBasicSalaryPerDay() {
		return basicSalaryPerDay;
	}
	public void setBasicSalaryPerDay(double basicSalaryPerDay) {
		this.basicSalaryPerDay = basicSalaryPerDay;
	}
	public int getNoOfWorkingdays() {
		return noOfWorkingdays;
	}
	public void setNoOfWorkingdays(int noOfWorkingdays) {
		this.noOfWorkingdays = noOfWorkingdays;
	}
	public Employee(int empId, String empName, double basicSalaryPerDay, int noOfWorkingdays) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalaryPerDay = basicSalaryPerDay;
		this.noOfWorkingdays = noOfWorkingdays;
	}
	
	  

}
