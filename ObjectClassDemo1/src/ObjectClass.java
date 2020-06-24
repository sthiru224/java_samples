/*
Class - A class can be defined as a template/blueprint that describes the 
        behavior/state that the object of its type support.

Object - Objects have states (properties) and behaviors (methods/functions). 
			Example: A dog has states - color, name, breed 
			         as well as behaviors – wagging the tail, barking, eating. 
		An object is an instance of a class.
 
 */


public class ObjectClass {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Tommy");
		
		d1.setBreed("RUSSIAN TOY");
		d1.setAgeC(20);
		d1.setColor("Brown");
		d1.printDog();
		System.out.println("From Main:");
		System.out.println("Name1 : " + d1.getName() + ", Breed1 : " + d1.getBreed() + ", Age1 : " + d1.getAgeC() + ", Color1 : " + d1.getColor());
	}
}
