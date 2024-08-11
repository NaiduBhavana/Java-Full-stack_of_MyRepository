package org.studyeasy.com;

public class Car 
{
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() { 
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String run() {
		if(doors.equals("closed") && engine.equals("On")
				&& driver.equals("seated") && speed > 0)
		{
			return "running";
		}
		else
		{
			return "Notrunning";
		}
	}
	
}
