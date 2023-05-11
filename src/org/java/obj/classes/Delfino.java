package org.java.obj.classes;

import org.java.interf.Swimming;
import org.java.obj.abs.Animal;

public class Delfino extends Animal implements Swimming{

	public Delfino(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Eeeeeeeeeh");
		
	}

	@Override
	public void eat() {
		System.out.println("Mangio pesce");
		
	}
	
	@Override
	public void swim() {
		System.out.println("Sono " + getName() + ", Sto nuotando");
		
	}
	
	@Override
	public String toString() {
		return "Sono: " + getName() + ", Mangio pesce";
	}

	

}
