package com.zach.beans;

public class Cat {
	
	private String name;
	private String gender;
	private int numberOfSiblings;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setBreed(String gender) {
		this.gender = gender;
	}

	public int getNumberOfSiblings() {
		return numberOfSiblings;
	}

	public void setNumberOfSiblings(int numberOfSiblings) {
		this.numberOfSiblings = numberOfSiblings;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + gender + ", weight=" + numberOfSiblings + "]";
	}
}
