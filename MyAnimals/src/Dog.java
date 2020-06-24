/*
A Java class can only extend one parent class. 
Multiple inheritance is not allowed. 
Interfaces are not classes, however, and an interface can extend more 
than one parent interface.
The extends keyword is used once, and the parent interfaces are 
declared in a comma-separated list.
 */

class Dog extends Animal implements Mammal,Adoptable{
	public Dog(String name) {
		 super(name);
		// this.name = name;
	}
	public boolean isAdoptable() {
		return true;
	}
	public String getHomecareInstructions() {
		return "is a Dog and its Home Care Instructions are listed here : http://www.aspca.org/pet-care/dog-care/general-dog-care";
	}
	public boolean isWarmBlooded(){
	   return true;
	}
	public boolean isMammal(){
	   return true;
	}

}



