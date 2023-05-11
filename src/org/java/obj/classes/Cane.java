package org.java.obj.classes;

import org.java.obj.abs.Animal;

public class Cane extends Animal {
	

	public Cane(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		
		System.out.println("Bau");
		
	}
	

	@Override
	public void eat() {
		
		System.out.println("Mangio croccantini");
		
	}
	
	@Override
	public String toString() {
		return "Sono: " + getName() + ", Mangio croccantini";
	}

}
