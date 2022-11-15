package com.chainsys.day2;

public class TexrBus {

	public static void main(String[] args) {
		Bus bus1=new Bus();
		bus1.busId = 12;
		bus1.nonStop= false;
		bus1.busSource="chennai";
		bus1.busDestination="Madursi";
		System.out.println(bus1.busId);
		System.out.println(bus1.busDestination);
		System.out.println("bus1.fare");
		Bus bus2=new Bus();
		bus2.noofSeats= 100;
		bus2.busDestination= "Tanjore";
		

	}

}
