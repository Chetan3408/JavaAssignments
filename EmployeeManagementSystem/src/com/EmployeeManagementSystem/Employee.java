package com.EmployeeManagementSystem;

public class Employee {

	private String name;
	private int empId;
	private String department;

	public Employee(String name, int empId, String department) {
		this.department = department;
		this.empId = empId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public String getDepartment() {
		return department;
	}

	public double calculatePay() {
		return 0.0;
	}

	public void displayetails() {
		System.out.println("Name : " + name);
		System.out.println("Employee Id : " + empId);
		System.out.println("Department : " + department);
	}

}
