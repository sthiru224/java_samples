/*
 * 	Abstract classes are classes that contain one or more abstract methods. 
 *  An abstract method is a method that is declared, but contains no implementation. 
 *  Abstract classes may not be instantiated, and require subclasses to provide 
 *  implementations for the abstract methods.
 *  In this example isWarmBlooded is an Abstract class 
 * 
 */

abstract class Animal {
	 String name = null;

	public Animal(String name) {
		//  super();
		this.name = name;
	}

	public abstract boolean isWarmBlooded();

	public String toString() {
		return "Name is: " + this.name;
	}
}
 
