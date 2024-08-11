package org.studyeasy.com;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println(c.run());

	}
	//In this we face Null pointer exception.which we will learn further.
	//Null pointer exception is due to following reason:
	//As discussed in previous session in java default instance variable value of
	//string is null.
	//Here in run method we are comparing null value with another string value that'swhy
	//it is throwing "Null Pointer Exception" error.

}
