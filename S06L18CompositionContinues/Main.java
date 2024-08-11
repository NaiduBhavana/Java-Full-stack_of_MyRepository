package org.studyeasy.com;
import org.studyeasy.com.Laptop;
public class Main 
{
	public static void main(String args[]) 
	{
	Laptop lapi = new Laptop();
	System.out.println(lapi.getProcessor().getBrand());
	Processor p1 = new Processor();
	GraphicsCard g1 = new GraphicsCard();
	
	Laptop l1 = new Laptop(15.6f,p1,"16GB","2TB",g1,"Multi Layer","Backlit");
	
	System.out.println(l1);

	}
}
