package com.chainsys.day2;

import java.util.Scanner;

public class Hospital1 {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emergencyNo");
		int emergencynumber=sc.nextInt();
		System.out.println("hospitalName");
		String hospitalName=sc.next();
		System.out.println(hospital.hospitalName);
		System.out.println(hospital.emergencyNo);
		
		}

}
