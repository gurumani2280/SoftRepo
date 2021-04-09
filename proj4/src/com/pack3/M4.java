package com.pack3;

public class M4 {
	//finalize()  -- Garbage Collection
	public static void main(String[] args) {
		System.out.println("main begin");
		A a1 =  new A(10);
		A a2 =  new A(30);
		 new A(0);
		a1 = null;
		a2 = null;
		System.out.println("both objects eligble for GC");
		//System.gc();
		Runtime.getRuntime().gc();
		System.out.println("done");
	}
}

class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("from finalize of A "+ i);
		super.finalize();
	}
}
