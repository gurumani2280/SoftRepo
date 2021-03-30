package com.pack11;

interface UsbPort
{
	void read();
	void write();
}
class Pendrive implements UsbPort
{
	public void read()
	{
		System.out.println("reading from pen drive");
	}
	public void write()
	{
		System.out.println("writing into pen drive");
	}
}
class Mobile implements UsbPort
{
	public void read()
	{
		System.out.println("reading from mobile");
	}
	public void write()
	{
		System.out.println("writing into Mobile");
	}
}

class MyClass
{
	static void myMethod(UsbPort driver)
	{
		driver.read();
		driver.write();
	}
}
public class Tester 
{
	public static void main(String[] args) 
	{
		System.out.println("main begins");
		MyClass.myMethod(new Pendrive());
		System.out.println("=======");
		MyClass.myMethod(new Mobile());
		System.out.println("=======");

	}
}
