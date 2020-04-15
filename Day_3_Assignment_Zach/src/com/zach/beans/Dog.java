package com.zach.beans;

public class Dog {
	
	private String name;
	private String breed;
	private int numberOfToys;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getNumberOfToys() {
		return numberOfToys;
	}

	public void setNumberOfToys(int numberOfToys) {
		this.numberOfToys = numberOfToys;
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + breed + ", weight=" + numberOfToys + "]";
	}
}
