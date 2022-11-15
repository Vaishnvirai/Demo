package com.chainsys.day2;
import java.util.Scanner;
public class Hotel1 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
Hotel hot=new Hotel();
System.out.println("Enter hotel Name");
String hotelName=sc.next();
System.out.println("Enter hotelNumber");
long hotelNumber=sc.nextLong();
System.out.println("Enter noOfRooms");
int noOfRooms=sc.nextInt();
System.out.println("Enter twocotbedavailable");
boolean twocotbedavailable=sc.nextBoolean();
System.out.println("Enter Receptionist");
String Reception=sc.next();
System.out.println(hotelName);
System.out.println(hotelNumber);
System.out.println(noOfRooms);
System.out.println(twocotbedavailable);
System.out.println(Reception);




	}

}
