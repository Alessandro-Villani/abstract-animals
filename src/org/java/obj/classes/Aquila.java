package org.java.obj.classes;

import org.java.interf.Flying;
import org.java.obj.abs.Animal;

public class Aquila extends Animal implements Flying {

	public Aquila(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Fiuuuuuu");
		
	}

	@Override
	public void eat() {
		System.out.println("Mangio carne");
		
	}
	
	@Override
	public void fly() {

		System.out.println("Sono " + getName() + ", Sto volando");
		
	}
	
	@Override
	public String toString() {
		return "Sono: " + getName() + ", Mangio carne";
	}

}
