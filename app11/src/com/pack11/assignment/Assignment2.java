/*
 Create Interface Shape with method draw() and area() , having subclasses like Circle, Rectangle, Triangle
	Implement abstract methods of the interface in the subclasses
	Create class MyDrawing -- having method, --- methods can be static or non static
	Shape getShape(char ch) -- return shape type objects based on provided char and 
	public void getDrawingAndArea(Shape shape) -- which call draw() and area() for the give Shape type 
	
	In main class and 
	call the MyDrawing class methods bu passing different chars
 */

package com.pack11.assignment;

interface Shape{
	void draw();
	void area();
}

class Circle implements Shape {
	float r=2;
	public void draw() {
		System.out.println("Draw Circle");
	}
	public void area() {
	     float ac= 3.142f*r*r;
	     System.out.println("Area of circle : "+ac);
	}
}

class Square implements Shape {
	int s=3;
	public void draw() {
		System.out.println("Draw Square.");
	}
	public void area() {
	     int as= s*s;
	     System.out.println("Area of Square: "+as);
	}
}

class Rectangle implements Shape {
	int l=2;
	int b=3;
	public void draw() {
		System.out.println("Draw Rectangle.");
	}
	public void area() {
	     int ar= l*b;
	     System.out.println("Area of Rectangle : "+ar);
	}
}

class MyDrawing {
	Shape getShape(char ch) {
		if(ch == 'c')
		{
			return new Circle();
		} else if(ch == 's')
		{
			return new Square();
		}else {
			return new Rectangle();
		}
	}
	public void getDrawingAndArea(Shape shape)
	{
		shape.draw();
		shape.area();
	}
	
}
public class Assignment2 {

	public static void main(String[] args) {
		MyDrawing ob=new MyDrawing();
		
		ob.getDrawingAndArea(ob.getShape('c'));
		ob.getDrawingAndArea(ob.getShape('s'));
		ob.getDrawingAndArea(ob.getShape('r'));
	}

}