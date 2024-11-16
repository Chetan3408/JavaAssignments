package com.EmployeeManagementSystem;

public class EmployeeManagementSystem {

	public static void main(String[] args) {

		FullTimeEmployees fulltimeemployee = new FullTimeEmployees("Nikhil", 803, "Engineering", 50000, 2300);
		Contractors contractors = new Contractors("Harikrishna", 102, "Sales", 21, 3000);

		System.out.println("Employee Details: \n");
		fulltimeemployee.displayetails();
		System.out.println("\n---------------------\n");
		contractors.displayetails();
	}

}
