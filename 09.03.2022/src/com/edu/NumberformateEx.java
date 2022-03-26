package com.edu;

public class NumberformateEx {

	public static void main(String[] args) {
		String s="java program";
		System.out.println("before parseInt");
		try
		{
			int i=Integer.parseInt(s);
		}catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println("after parseInt");

	}

}
