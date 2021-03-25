package com.pack9.part2;
enum Day
{
	SUNDAY, MONDAY;
}
@interface A
{
}
@A
public class Tester 
{
	@A
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(Day.SUNDAY);
		System.out.println(Day.MONDAY);
	}
}
