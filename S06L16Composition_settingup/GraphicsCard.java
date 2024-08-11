package org.studyeasy.com;

public class GraphicsCard 
{
	private String brand;
	private int series;
	private String memory;
	
	public GraphicsCard() 
	{
		this.brand = "Nvidia";
		this.series = 310;
		this.memory = "6GB";
	}

	@Override
	public String toString() {
		return "GraphicsCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}

	
	
}
