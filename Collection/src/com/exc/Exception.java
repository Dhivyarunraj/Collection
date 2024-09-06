package com.exc;

public class Exception {

	public static void main(String[] args) {
		try{
			int d=25/0;
			System.out.println(d);
		}
		catch(ArithmeticException r)
		{
			System.out.println(r);
		}
		finally {
			System.out.println("null pointer exception");
		}

	}

}
