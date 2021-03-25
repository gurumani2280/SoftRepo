package com.pack9.part2;
abstract class Benz
{
	abstract void engine();
	abstract void speed();
	void logo()
	{
		System.out.println("Benz logo");
	}
}

class AclassBenz extends Benz
{
	void engine()
	{
		System.out.println("A class Benz Engine");
	}

	void speed()
	{
		System.out.println("A class Benz speed");
	}

}

class BclassBenz extends Benz
{
	void engine()
	{
		System.out.println("B class Benz Engine");
	}

	void speed()
	{
		System.out.println("B class Benz speed");
	}

}
public class Tester2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main begins");
		AclassBenz acb = new AclassBenz();
		acb.logo();
		acb.engine();
		acb.speed();
		System.out.println("=======---------===========");
		BclassBenz bcb = new BclassBenz();
		bcb.logo();
		bcb.engine();
		bcb.speed();
		System.out.println("Main ends");
	}
}
