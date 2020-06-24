public class Dog{
	
	// Properties of a Dog 
	
	 String name;
	 String breed;
	 int    ageC;
	 String color;
	 
	 // Constructor 
	 
	 public Dog(String name) {
		 this.name = name;
	 }
	 
	 // Behaviors / Methods of a dog
	 public void barking(){
		 System.out.println(name + " is barking");
	 	}

	 public void hungry(){
		 System.out.println(name + " is hungry");
	 }

	 public void sleeping(){
		 System.out.println(name + " is sleeping");
	 }
	 
	 // Setters 
	 
	
	 public void setBreed(String breed) {
		 this.breed = breed;
	 }
	 public void setAgeC(int age) {
		 this.ageC = age;
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
	 public int getAgeC() {
			 return(this.ageC);
		 }
	 public	 String getColor() {
			 return(this.color); 
		 };
	 
	// Print the Doc Details.
	
     public void printDog() {
		      System.out.println(" Name1:"+ this.name );
		      System.out.println("Breed1:" + this.breed );
		      System.out.println("  Age1:" + this.ageC );
		      System.out.println("Color1:" + this.color);
		   }	 
}

