package com.example3;

import java.util.Scanner;

public class Exmaple3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int age=sc.nextInt();
		System.out.println("enter weight:");
		int  weight=sc.nextInt();
	
		if((age>=20  && age<=60)&& (weight>=40 && weight<=70))
		{
			System.out.println("valid donar");
	    }
		else {
			throw new Invaliddonar("invalid  donar");

		}
	}

}
