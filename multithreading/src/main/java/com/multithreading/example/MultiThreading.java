package com.multithreading.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreading {

	public static void main(String[] args) {

		Employee e = new Employee(1, "Lakshmi", 100000, 24);
		Employee e1 = new Employee(2, "akash", 200000, 14);
		Employee e2 = new Employee(3, "mouni", 300000, 21);
		Employee e3 = new Employee(4, "kanika", 40000, 22);
		Employee e4 = new Employee(5, "divya", 50000, 24);
		Employee e5 = new Employee(6, "ganesh", 70000, 22);
		Employee e6 = new Employee(7, "kamala", 80000, 24);
		Employee e7 = new Employee(8, "vijaya", 10000, 23);
		Employee e8 = new Employee(9, "sony", 90000, 24);
		Employee e9 = new Employee(10, "Lakshmi2", 67000, 24);
		Employee e10 = new Employee(11, "Lakshmivamsi", 880000, 25);
		
		List<	Employee> empList = new ArrayList<>();
		
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		empList.add(e9);
		empList.add(e10);
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(int i = 0 ; i <empList.size();i++) {
			
			SalaryCaculation salaryCal = new SalaryCaculation(empList.get(i));
			service.execute(salaryCal);
			
		}
		//service.shutdown();
	}

}
