package org.studyeasy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike("Petrol",2,2,21,"LED","Single handed");
		System.out.println(b.getEngine());
		System.out.println(b.getFueltank());
		System.out.println(b.getHandle());
		System.out.println(b.getLights());
		System.out.println(b.getSeats());
		System.out.println(b.getWheels());
		
		//To string() is the method which will help us to directly print the information of the object
		
		

	}

}
