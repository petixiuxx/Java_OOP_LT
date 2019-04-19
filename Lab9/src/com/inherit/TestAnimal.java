package com.inherit;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// subclass
		Cat cat1 = new Cat(); 
		cat1.greeting();		// Meow!
		Dog dog1 = new Dog(); 
		dog1.greeting();		// Woof!
		BigDog bigDog1 = new BigDog();
		bigDog1.greeting();		//Woow!
	
		//polymorphism
		Animal animal1 = new Cat(); 
		animal1.greeting();		//Meow!
		Animal animal2 = new Dog();
		animal2.greeting();		// Woof!
		Animal animal3 = new BigDog();
		animal3.greeting();		// Woow!
//		Animal animal4 = new Animal();	
		// Error cannot initiate abstract calss
		
		//Downcast
		Dog dog2 = (Dog)animal2;
		BigDog bigDog2 = (BigDog)animal3;
		Dog dog3 = (Dog)animal3;
//		Cat cat2 = (Cat)animal2;	
		// Error This will throw a ClassCastException 
		// because the actual object type is Cat. And a Cat is not a Dog so we cannot cast it to a Dog.
		dog2.greeting(dog3);		// Woooooooooooof!
		dog3.greeting(dog2);		// Wooooooowwwww!
		dog2.greeting(bigDog2);		// Woooooooooooof!
		bigDog2.greeting(dog2);		// Wooooooowwwww!
		bigDog2.greeting(bigDog1);	// Wooooooowwwww!
		
	}

}
