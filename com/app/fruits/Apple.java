package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String name, String color, double weight) {
		super(name, color, weight);
		
	}

	@Override
	public String taste() {
		//System.out.println("Taste is Sweet and Sour.");
		return "Sweet and Sour";
			}
	
	public void jam() {
		System.out.println(getName()+" Making jam.");
	}

	@Override
	public String toString() {
		return "Apple [getName()=" + getName() + ", getWeight()=" + getWeight() + ", isFresh()=" + isFresh()
				+ ", getColor()=" + getColor() + "]";
	}
	
	
	
	

}
