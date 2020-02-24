package com.Exception;

import java.util.Scanner;

public class RegistartionMain {
	public static void main(String args[])
	{
		String mailid;
		String name;
		String mobileno;
		double toprice;
		Scanner s = new Scanner(System.in);
		System.out.println("enter first string objects");
		s.nextLine();
		s.nextLine();
		s.nextLine();
		s.nextDouble();
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter second string object");
		s1.nextLine();
		s1.nextLine();
		s1.nextLine();
		s.nextDouble();
		if(s.equals(s1))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("different");
		}
		
		
		
		
		
	}

}
