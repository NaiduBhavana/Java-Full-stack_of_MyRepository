package org.studyeasy;

public class Bike extends Vehicle 
{
	private String handle;

	public Bike() 
	{
		handle = "single handle";
	}
	
//Parameterized constructor
	
	public Bike(String engine, int wheels, int seats, int fueltank, String lights, String handle) {
		super(engine, wheels, seats, fueltank, lights);
		this.handle = handle;
	}

	@Override
	public String toString() {
		return "Bike [handle=" + handle + ",Engine()=" + getEngine() + ",Wheels()=" + getWheels()
				+ ", Seats()=" + getSeats() + ", Fueltank()=" + getFueltank() + ", Lights()=" + getLights()
				+ ", Class()=" + getClass()
				+ "]";
	}

	


//	public String getHandle() {
//		return handle;
//	}
	
	
}
