package org.java.main;

import org.java.obj.abs.Animal;
import org.java.obj.classes.AnimalManager;
import org.java.obj.classes.Aquila;
import org.java.obj.classes.Cane;
import org.java.obj.classes.Delfino;
import org.java.obj.classes.Passerotto;

public class Main {

	public static void main(String[] args) {

		Aquila a = new Aquila("Aquila");
		
		Cane c = new Cane("Cane");
		
		Delfino d = new Delfino("Delfino");
		
		Passerotto p = new Passerotto("Passerotto");
		
		Animal[] animals = {a, c, d, p};
		
		for(int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.makeSound();
		}
		
		AnimalManager.faiVolare(a);
		AnimalManager.faiVolare(p);
		AnimalManager.faiNuotare(c);
		AnimalManager.faiNuotare(d);
		

	}

}
