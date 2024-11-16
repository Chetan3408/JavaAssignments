package com.EmployeeManagementSystem;

public class FullTimeEmployees extends Employee {

	private double baseSalary;
	private double bonus;

	public FullTimeEmployees(String name, int empId, String department, double baseSalary, double bonus) {
		super(name, empId, department);
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}

	@Override
	public double calculatePay() {
		return baseSalary + bonus;
	}

	@Override
	public void displayetails() {
		super.displayetails();
		System.out.println("Role : Full time Employee");
		System.out.println("Base Salary : " + baseSalary);
		System.out.println("Bonus : " + bonus);
		System.out.println("Total Pay :" + calculatePay());
	}

}
