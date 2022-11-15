package com.chainsys.day2;

import java.util.Scanner;

public class CallTest {

	public static void main(String[] args) {
		CallTest call=new CallTest();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 2 number to perform arithmetic operations");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		call.a=num1;
		call.b=num2;
		System.out.println("Sum of given number:"+(num1+num2));
		System.out.println(num1 / num2);
		
		}

}
