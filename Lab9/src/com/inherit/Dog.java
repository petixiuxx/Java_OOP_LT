package com.inherit;

public class Dog extends Animal {

	public void greeting() {
		System.out.println("Woof!");
	}

	public void greeting(Dog another) {
		System.out.println("Woooooooooooof!");
	}

}
