package com.app.fruits;

public abstract class Fruit {
	private String name,color;
	private double weight;
	private boolean fresh;
	public Fruit(String name, String color, double weight) {
		
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh=true;
	}
	
	public abstract String taste();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
	
	
	


}
