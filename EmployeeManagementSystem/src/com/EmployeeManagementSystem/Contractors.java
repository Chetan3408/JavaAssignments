package com.EmployeeManagementSystem;

public class Contractors extends Employee {

	private double hourlyRate;
	private int hoursWorked;

	public Contractors(String name, int empId, String department, double hourlyRate, int hoursWorked) {
		super(name, empId, department);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculatePay() {
		return hourlyRate + hoursWorked;
	}

	@Override
	public void displayetails() {
		super.displayetails();
		System.out.println("Role : Contractor");
		System.out.println("Hourly Rate : " + hourlyRate);
		System.out.println("Hourly Worked : " + hoursWorked);
		System.out.println("Total Pay : " + calculatePay());
	}

}
