package com.app.fruits;

public class Mango extends Fruit{

	public Mango(String name, String color, double weight) {
		super(name,color,weight);
		
		
	}

	@Override
	public String taste() {
		//System.out.println("Taste is sweet.");
		return "Sweet";
	}
	
	public void Pulp() {
		System.out.println(getName()+" "+getColor()+" creating Pulp! ");
		}

	@Override
	public String toString() {
		return "Mango [getName()=" + getName() + ", getWeight()=" + getWeight() + ", isFresh()=" + isFresh()
				+ ", getColor()=" + getColor() +  "]";
	}
	
	

}
