package org.java.obj.classes;

import org.java.interf.Flying;
import org.java.interf.Swimming;

public class AnimalManager {
	
	public static void faiVolare(Flying animal) {
		animal.fly();
	}
	
	public static void faiNuotare(Swimming animal) {
		animal.swim();
	}
	
}
