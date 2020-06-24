/*
Class - A class can be defined as a template/blueprint that describes the 
        properties and behaviors of an object.
        Note: Public Class should be in its own file with the name as class. 

Object - Objects have states (properties) and behaviors (methods/functions). 
			Example: A dog has states - color, name, breed 
			         as well as behaviors – wagging the tail, barking, eating. 
		An object is an instance of a class.

 
 
 */

class Dog{
	
	// Properties of a Dog 
	
	 String name;
	 String breed;
	 int    age;
	 String color;
	 
	 // Constructor 
	 
//	 public Dog(String name) {
//		 this.name = name;
//	 }
	 
	 // Behaviors / Methods of a dog
	 
	 public void barking(){
		 System.out.println(name + " is barking");
	 	}

	 public boolean hungry(){
		 System.out.println(name + " is hungry");
		 if(this.age > 2) 
			 return(true);
		 else
			 return(false);
	 }

	 public void sleeping(){
		 System.out.println(name + " is sleeping");
	 }
	 
	 // Setters 
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	
	 public void setBreed(String breed) {
		 this.breed = breed;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 public void setColor(String color) {
		 this.color = color; 
	 };
	 
	 // Getters
	 
	 public String getName() {
			 return(this.name);
		 }
	 public String getBreed() {
			 return(this.breed);
		 }
	 public int getAge() {
			 return(this.age);
		 }
	 public	 String getColor() {
			 return(this.color); 
		 };
	 
	// Print the Doc Details.
	
     public void printDog() {
		      System.out.println(" Name:"+ this.name );
		      System.out.println("Breed:" + this.breed );
		      System.out.println("  Age:" + this.age );
		      System.out.println("Color:" + this.color);
		   }	 
}


public class ObjectClass {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.setName("Tommy");
		d1.setBreed("RUSSIAN TOY");
		d1.setAge(1);
		d1.setColor("Brown");
		d1.printDog();
		
		System.out.println("From Main: Name : " + d1.getName() + ", Breed : " + d1.getBreed() + ", Age : " + d1.getAge() + ", Color : " + d1.getColor());
		d1.sleeping();
		d1.barking();
		if(d1.hungry()) 
			System.out.println("Feed " + d1.getName() + " some food");
		else System.out.println(d1.getName() + " does not need food now");
		
	}
}
