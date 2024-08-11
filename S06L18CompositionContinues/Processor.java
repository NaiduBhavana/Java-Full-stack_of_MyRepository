package org.studyeasy.com;

public class Processor 
{
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cachememory;
	private String frequency;
	private String minFrequency;
	private String maxFrequency;
	
	public Processor() 
	{
		this.brand = "Intel";
		this.series = "11000U";
		this.generation = 11;
		this.cores = 4;
		this.threads = 4;
		this.cachememory = "5 MB";
		this.frequency = "2.5GHZ";
		this.minFrequency = "2.4GHZ";
		this.maxFrequency = "3.1GHZ";
	}
	

	public String getBrand() {
		return brand;
	}


	public String getSeries() {
		return series;
	}


	public int getGeneration() {
		return generation;
	}


	public int getCores() {
		return cores;
	}


	public int getThreads() {
		return threads;
	}


	public String getCachememory() {
		return cachememory;
	}


	public String getFrequency() {
		return frequency;
	}


	public String getMinFrequency() {
		return minFrequency;
	}


	public String getMaxFrequency() {
		return maxFrequency;
	}


	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cachememory=" + cachememory + ", frequency=" + frequency
				+ ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + "]";
	}

	
}
