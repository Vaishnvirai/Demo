package com.chainsys.day2;
import java.util.Scanner;
public class Vehicle1 {

    public static void main(String[] args) {
		System.out.println();
		Vehicle vec=new Vehicle();
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Vehicle Name");
		String vehicleName=sc.next();
		System.out.println("Enter price");
		int price=sc.nextInt();
		System.out.println("Enter VehicleModelName");
		String modelName=sc.next();
		System.out.println("Enter AirBagAvailable");
		boolean Airbag=sc.nextBoolean();
		System.out.println("Enter Branch");
		String branch=sc.next();
		System.out.println(vehicleName);
		System.out.println(price);
		System.out.println(modelName);
		System.out.println(Airbag);
		System.out.println(branch);
		
		
    }

}
