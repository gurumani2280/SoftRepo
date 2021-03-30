package com.pack11;

interface Switch
{
	void on();
	void off();
}
class Bulb implements Switch
{
	public void on()
	{
		System.out.println("bulb is turned on");
	}
	public void off()
	{
		System.out.println("bulb is turned off");
	}
}
class Fan implements Switch
{
	public void on()
	{
		System.out.println("Fan is turned on");
	}
	public void off()
	{
		System.out.println("Fan is turned off");
	}
}

class MyRoom
{
	static Switch mySwitch(char ch)
	{
		if(ch == 'B')
		{
			return new Bulb();
		}
		else
		{
			return new Fan();
		}
	}
}
public class Tester1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begins");
		Switch s1 = MyRoom.mySwitch('B');
		s1.on();
		s1.off();
		System.out.println("=======");
		Switch s2 = MyRoom.mySwitch('F');
		s2.on();
		s2.off();
		System.out.println("main begins");
	}
}
