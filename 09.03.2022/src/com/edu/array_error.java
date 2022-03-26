package com.edu;
import java.util.Scanner;
import java.util.Scanner.*;
public class array_error {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++){
			a[i]=scanner.nextInt();
		
		}
		System.out.println("Array element are");
		for(int i=0;i<a.length+1;i++)
		{
			try
			{
				System.out.println(a[i]);
			}catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("statement after for loop");
	}

}
