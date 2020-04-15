package com.casey.cannery;

import com.zach.beans.Cat;
import com.zach.beans.Dog;

public class ZooKeeper {
	
	public static void main(String[] args) {
		
		Cat fluffy = new Cat();
		Dog spike = new Dog();
		
		fluffy.setName("Fluffy");
		fluffy.setBreed("Calico");
		fluffy.setNumberOfSiblings(1);
		
		spike.setName("Spike");
		spike.setBreed("Dobermin");
		spike.setNumberOfToys(53);
		
		System.out.println(spike.toString());
		System.out.println(fluffy.toString());
	}
}
