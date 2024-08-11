package org.studyeasy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.handle = "Singlehandle";
		System.out.println(b.handle);
		b.engine = "ON";
		b.fueltank = 5;
		b.lights = "ON";
		b.seats = 4;
		b.wheels = 4;
		System.out.println("Type of handle is "+ b.handle);
		System.out.println("State of engine is : "+b.engine);
		System.out.println("Number of liters in fueltank is : "+b.fueltank);
		System.out.println("State of lights is : "+b.lights);
		System.out.println("Number of seats are : "+b.seats);
		System.out.println("Number of wheels are : "+b.wheels);
		
		

	}

}
