package com.exc;

import java.util.Scanner;

public class Exceptn {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//System.out.println("enter the a");
		//int a=s.nextInt();
		//System.out.println("enter the b");
        //int b=s.nextInt();
        //int ad=a+b;
        //System.out.println("the sum of a and b" +ad);
        //int sub=a-b;
       // System.out.println("the subtraction of a and b " +sub);
        try {
        	int c[]=new int[5];
        	c[10]=50;
        }
        catch(ArrayIndexOutOfBoundsException p)
        {
        	System.out.println("array out of bound exception will occur");
        	
        }
	}

}
