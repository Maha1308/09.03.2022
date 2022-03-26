package com.edu;
import java.util.Scanner;
import java.util.Scanner.*;
public class array_error2 {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int ar[]=new int[4];
		System.out.println("before exception");
		
			try
			{
				System.out.println("inside try");
			c=a/b;
			ar[6]=8;
			
			}catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception");
				e.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException");
				e.printStackTrace();
			}
		
	finally
	{
			
		
		System.out.println("finally block");
	}
	}
}



