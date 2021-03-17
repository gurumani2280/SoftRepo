package com.pack5;

public class Employee
{
	static String companyName = "Wipro";
	String empName;
	double sal;
	public void drawSalary()
	{
		System.out.println("empName "+ empName +" has taken his salary "+ sal);
	}
	public static void display(Employee e)
	{
		System.out.println(Employee.companyName);
		System.out.println(e.empName);
		System.out.println(e.sal);
	}

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.empName = "mohan";
		e1.sal = 90000;
		display(e1);
		e1.drawSalary();
		System.out.println("============");
		Employee e2 = new Employee();
		e2.empName = "Radha";
		e2.sal = 100000;
		display(e2);
		e2.drawSalary();

	}
}
