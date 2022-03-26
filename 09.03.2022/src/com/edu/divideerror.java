package com.edu;

import java.util.Scanner;
public class divideerror {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first number");
		a=scanner.nextInt();
		System.out.println("enter the second number");
		b=scanner.nextInt();
		System.out.println("before division");
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("catch block executes o nly when exception occured");
			
		}
		finally
		{
			System.out.println("finally block executes always");
			
		}
		
		System.out.println("after division");
	}
	

}
