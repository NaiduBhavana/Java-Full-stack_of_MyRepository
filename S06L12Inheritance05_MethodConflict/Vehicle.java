package org.studyeasy;

public class Vehicle 
{
	private String engine;
	private int wheels;
	private int seats;
	private int fueltank;
	private String lights;
	public Vehicle() 
	{
		engine = "ON";
		wheels = 4;
		seats = 4;
		fueltank = 4;
 	}
	
	public Vehicle(String engine, int wheels, int seats, int fueltank, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fueltank = fueltank;
		this.lights = lights;
	}

	public String getEngine() {
		return engine;
	}
	public int getWheels() {
		return wheels;
	}
	public int getSeats() {
		return seats;
	}
	public int getFueltank() {
		return fueltank;
	}
	public String getLights() {
		return lights;
	}
	
	
}
