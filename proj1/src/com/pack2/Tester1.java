package com.pack2;


class G
{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	

	}
public class Tester1 {

	public static void main(String[] args) {
		G rv = new G();
		//rv.i =20;
		System.out.println(rv.getI());
		rv.setI(90);
		System.out.println(rv.getI());

	}

}
