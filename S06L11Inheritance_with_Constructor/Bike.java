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


	public String getHandle() {
		return handle;
	}
	
	
}
