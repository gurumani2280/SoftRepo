package com.pack5;

public class H
{
		public static void main(String[] args)
		{
			System.out.println("main begins");
			System.out.println("i "+ I.i);
			System.out.println("j "+ I.j);
			I rv = new I();
			System.out.println("k "+ rv.k);
			I rv1 = new I();
			System.out.println("k "+ rv1.k);
			H rv2 = new H();
			System.out.println("main ends");
		}
}
class I
{
	static int i;
	static int j;
	int k;
	

}