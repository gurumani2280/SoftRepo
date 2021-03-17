package com.pack5;

public class J 
{
	int empId =10;
	public void printEmpId()
	{
		System.out.println("Emp Id "+ this.empId);

	}
	public static void main(String[] args)
	{
		System.out.println("main starts");
		J rv = new J();
		rv.printEmpId();
		System.out.println("main ends");
	}
}
