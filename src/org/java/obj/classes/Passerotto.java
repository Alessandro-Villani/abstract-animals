package org.java.obj.classes;

import org.java.interf.Flying;
import org.java.obj.abs.Animal;

public class Passerotto extends Animal implements Flying{

	public Passerotto(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		
		System.out.println("Cip");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Mangio insetti");
		
	}
	
	@Override
	public void fly() {
		
		System.out.println("Sono " + getName() + ", Sto volando");
		
	}
	
	@Override
	public String toString() {
		return "Sono: " + getName() + ", Mangio insetti";
	}


}
