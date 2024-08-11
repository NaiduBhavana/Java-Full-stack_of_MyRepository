package Section4_Methods;
import java.io.*;
import java.util.*;

public class returntype 
{
	public static int areaofrectangle(int length,int breadth)
	{
		return length*breadth;
	}
	public static void main(String[] args) 
	{
		System.out.println("Area of rectangle is :" +areaofrectangle(20,10));
	}

}
