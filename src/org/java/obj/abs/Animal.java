package org.java.obj.abs;

public abstract class Animal {
	
	private String name;
	
	public Animal(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void dormi() {
		System.out.println("Zzz");
	}
	
	public abstract void makeSound();
	
	public abstract void eat();
	
	@Override
	public String toString() {
		return name;
	}
	
	

}
