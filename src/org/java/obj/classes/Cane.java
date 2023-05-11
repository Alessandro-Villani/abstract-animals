package org.java.obj.classes;

import org.java.interf.Swimming;
import org.java.obj.abs.Animal;

public class Cane extends Animal implements Swimming {
	

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
	public void swim() {
		
		System.out.println("Sono " + getName() + ", Sto nuotando");
		
	}
	
	@Override
	public String toString() {
		return "Sono: " + getName() + ", Mangio croccantini";
	}


}
