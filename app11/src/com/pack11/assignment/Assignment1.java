/* 
 1.Create Interface Animal --- having abstract method sound() which is implemented by various animal sub Classes 
 2.create an array of the Animal interface type, in the array store the objects of all Animal subclassed
 Animal[] arr ={new Cat(), new Dog(),new Elephant(), new Lion()}
 
 3.iterate through the array using For loop in main class
and inside for loop call the sound () of the Animal
 for(int i = 0; i <arr.length; i ++)
	{
		 arr[i].sound();
	}

 */

package com.pack11.assignment;

interface AnimalSound {
	void sound();
}

class Cat implements AnimalSound 
{
	public void sound() {
		System.out.println("Cat Sound");
	}
}

class Dog implements AnimalSound 
{
	public void sound() {
		System.out.println("Dog Sound");
	}
}

class Elephant implements AnimalSound 
{
	public void sound() {
		System.out.println("Elephant Sound");
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		AnimalSound[] arr = {new Cat(), new Dog(), new Elephant()} ;
		
		for(int i = 0; i <arr.length; i ++)
		{
		 arr[i].sound();
	    	}
	}
}