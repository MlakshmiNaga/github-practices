//package com.multithreading.example;
//
//public class ExampleMultiThreading extends Thread {
//
//	public static void main(String[] args) {
//		ExampleMultiThreading t1 = new ExampleMultiThreading();
//		t1.start();
//		t1.start();//illegalThreadSafeException (threadStatus !=0)
//		ExampleMultiThreading t2 = new ExampleMultiThreading();
//		t2.start();
//
//	}
//	@Override
//	public void run() {
//		System.out.println("runMethod");
//		calculationSalary();
//		
//	}
//	void calculationSalary() {
//		System.out.println("CalculationSalary");
//	}
//
//
//}
