package com.multithreading.example;

public class SalaryCaculation implements Runnable {
	private Employee e = null;
	SalaryCaculation(Employee e){
		this.e = e;
	}
	@Override
	public void run() {
		salaryCalculation();
		
	}
	void salaryCalculation() {
		Thread.currentThread().getName();
		
		double salary = e.getBasicSalaryPerDay()* e.getNoOfWorkingdays(); 
		e.setSalary(salary);
		System.out.println("name : " + e.getEmpName()  +  "  salary:  " +  salary);
	}

}
