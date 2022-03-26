package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class example1 {

	public static void main(String[] args) throws IOException
	{
		String name="";
		int age=0;
		float salary=0.0f;
		 //InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br= new BufferedReader(is);
		 
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		 System.out.println("enter  you name");
		 name= br.readLine();
		 System.out.println("enter your age");
		 age=Integer.parseInt(br.readLine());
		 System.out.println("enter your salary");
		 salary=Float.parseFloat(br.readLine());
		 System.out.println("Details of employee");
		 System.out.println(name);
		 System.out.println(age);
		 System.out.println(salary);
	}

}
