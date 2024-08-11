package Section4_Methods;

public class Methodoverload 
{

	public static void main(String[] args) 
	{
		System.out.println("Area of rectangle: "+area(10,20));
		System.out.println("Area of square: "+area(5));

	}
	public static int area(int height,int width)
	{
		return height*width;
	}
	public static int area (int side)
	{
		return side * side;
	}
	

}
