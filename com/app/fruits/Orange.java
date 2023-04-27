package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String name, String color, double weight) {
		super(name, color, weight);
		
	}

	@Override
	public String taste() {
		//System.out.println("Taste is sour.");
		return "sour";
		}
	
	public void juice() {
		System.out.println(getName()+" "+getWeight()+" Extracting juice!");
	}

	@Override
	public String toString() {
		return "Orange [getName()=" + getName() + ", getWeight()=" + getWeight() + ", isFresh()=" + isFresh()
				+ ", getColor()=" + getColor() + "]";
	}
	
	
	

}
