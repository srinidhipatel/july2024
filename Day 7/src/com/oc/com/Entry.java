package com.oc.com;

import javax.xml.transform.Templates;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Classes are like a blue print
		 *  Objects are the real instances	
		 * 
		 * Blue print
		 * 
		 *  c1 is an object of a class
		 *  Car is an class (blue print)
		 * 
		 * */
		
		Car c1 = new Car();
		c1.sColor="Red";
		c1.noOfDoor=4;
		c1.noOfSeatings =5;
		
		System.out.println(c1.sColor);
		System.out.println(c1.noOfDoor);
		System.out.println(c1.noOfSeatings);
		
		Car c2 = new Car();
		c2.sColor="white";
		c2.noOfDoor=2;
		System.out.println(c2.sColor);
		
		Car c3 = new Car();
		c3.sColor="Blue";
		c3.noOfDoor=1;
		System.out.println(c3.sColor);
		
		c1.startEngine();
		
		System.out.println("*************************************************");
		System.out.println("C1 color : "+c1.sColor+"\t\tc1.NoOFDoor : "+ c1.noOfDoor);
		System.out.println("C2 color : "+c2.sColor+"\t\tc2.NoOFDoor : "+ c2.noOfDoor);
		System.out.println("C3 color : "+c3.sColor+"\t\tc3.NoOFDoor : "+ c3.noOfDoor);
		
		Car.sColor = "ORANGE";
		
		Car.turnRight();
		Garage.startService();
		// Static means it shares single memory for all the instances.. Even though if it is differnec einstances if it is staic it will share the same memory
		temp();
		// Static methods can call only static methods not others
		// Non static method can call static methods 
		// static methods can access static variables only but not non-static variables
		// Static methods can access only static methods not the non-static methods
		//
	}

	public static void temp() {
		Car c5 = new Car();
		c5.sColor="orange";
		System.out.println(c5.sColor);

	}
}
