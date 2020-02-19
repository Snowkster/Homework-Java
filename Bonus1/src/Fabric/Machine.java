package Fabric;

import java.awt.Color;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Machine {
	
	  private int power;
	  private float height;
	  private Color color;
	  Random rand = new Random(); 
	  
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
		
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	  
	Machine machine[] = new Machine [10];
	public void outPrint(){
		for (int i = 0; i < machine.length; i++) {
			System.out.println("Power of the engine is:" + getPower());
		}
	}
}
