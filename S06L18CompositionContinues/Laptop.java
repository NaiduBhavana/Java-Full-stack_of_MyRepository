package org.studyeasy.com;
import org.studyeasy.com.Processor;
import org.studyeasy.com.GraphicsCard;
public class Laptop 
{
	private float screen;
	private Processor processor;
	private String ram;
	private String harddrive;
	private GraphicsCard graphicscard;
	private String opticaldrive;
	private String keyboard;
	
	public Laptop() 
	{
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "16GB";
		this.harddrive = "2TB";
		this.graphicscard = new GraphicsCard();
		this.opticaldrive = "Multi Layer";
		this.keyboard = "Backlit";
	}
	
	

	public Laptop(float screen, Processor processor, String ram, String harddrive, GraphicsCard graphicscard,
			String opticaldrive, String keyboard) 
	{
		
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.harddrive = harddrive;
		this.graphicscard = graphicscard;
		this.opticaldrive = opticaldrive;
		this.keyboard = keyboard;
	}



	public float getScreen() {
		return screen;
	}


	public Processor getProcessor() {
		return processor;
	}


	public String getRam() {
		return ram;
	}


	public String getHarddrive() {
		return harddrive;
	}


	public GraphicsCard getGraphicscard() {
		return graphicscard;
	}


	public String getOpticaldrive() {
		return opticaldrive;
	}


	public String getKeyboard() {
		return keyboard;
	}


	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", \n processor=" + processor + ", ram=" + ram + ", harddrive=" + harddrive
				+ ", \n graphicscard=" + graphicscard + ", opticaldrive=" + opticaldrive + ", keyboard=" + keyboard
				+ "]";
	}
	



}
