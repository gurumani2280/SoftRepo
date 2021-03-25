package com.pack9.part2;
interface Exam
{
	void percentage();
}
class Student
{
	String sName;
	int mathMark;
	int scienceMark;
	int literatureMark;
	Student(String sName, int mathMark, int scienceMark, int literatureMark)
	{
		this.sName = sName;
		this.mathMark = mathMark;
		this.scienceMark = scienceMark;
		this.literatureMark = literatureMark;
	}
	void display()
	{
		System.out.println("Name "+ sName);
		System.out.println("Math Mark "+ mathMark);
		System.out.println("Science Mark "+ scienceMark);
		System.out.println("Literature Mark "+ literatureMark);
	}

}

class Result extends Student implements Exam
{
	Result(String sName, int mathMark, int scienceMark, int literatureMark)
	{
		super(sName, mathMark, scienceMark, literatureMark);
	}

	public void percentage()
	{
		int totalMarks = mathMark + scienceMark + literatureMark;
		int percent = (totalMarks*100)/300;
		System.out.println("Student name "+ sName +"\n total pecent "+ percent);
	}
}

public class Tester3 
{
	public static void main(String[] args) 
	{
		System.out.println("main begins");
		Result r1 = new Result("Praveen", 90, 98, 95);
		r1.display();
		r1.percentage();
		System.out.println("============");
		Result r2 = new Result("Rama", 70, 78, 75);
		r1.display();
		r1.percentage();
		System.out.println("main ends");



	}
}
