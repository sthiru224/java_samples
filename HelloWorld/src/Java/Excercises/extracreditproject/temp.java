abstract class Animal {
	private String name = null;

	public Animal(String name, int numberOfLegs) {
		super();
		this.name = name;
	}

	public abstract boolean isWarmBlooded();

	public String toString() {
		return "Name is: " + name + "\n";
	}
}
 
interface Adoptable 
{
	public boolean isAdoptable();
	public String getHomecareInstructions();
 }

interface Amphibian 
{
	public boolean isAmphibian();
 }


interface Mammal 
{
	public boolean isMammal();
 }

interface WaterLiveable 
{
	public boolean isWaterLiveable();
	public boolean canLiveOnLand();
 }


class Dog extends Animal implements Mammals,Adoptable{
	public Dog(String name) {
		super(name);
	}
	public boolean isAdoptable() {
		return true;
	}
	public string getHomecareInstructions() {
		return "Home Care Instructions";
	}
}


class Frog extends Animal implements Amphibian,Adoptable{
 
	public Frog(String name) {
		super(name);
	}

	public boolean isAdoptable() {
		return true;
	}

	public string getHomecareInstructions() {
		return "Home Care Instructions";
	}

	public boolean isAmphibian(){
		return true; 
	}

}


class Goldfish extends Animal implements WaterLiveable,Adoptable{
 
	public Goldfish(String name) {
		super(name);
	}

	public boolean isAdoptable() {
		return true;
	}

	public string getHomecareInstructions() {
		return "Goldfish : Home Care Instructions";
	}

	public boolean isWaterLiveable(){
		return true;
	};
	public boolean canLiveOnLand(){
		return false;
	};


}

class Whale extends Animal implements WaterLiveable,Mammal{
 
	public Whale(String name) {
		super(name);
	}
	public boolean isMammal() {
		return true;
	}
	public boolean isWaterLiveable(){
		return true;
	};
	public boolean canLiveOnLand(){
		return false;
	};

}


public  class FinalGradesExtraCreditExercise {
 
 public static void main(String[] args) {

  Dog dog1 = new Dog("Max");
  System.out.println(dog1.toText());

  Dog dog2 = new Dog("Bailey ");
  System.out.println(dog2.toText());

  Frog frog1 = new Frog("Hypnotoad");
   System.out.println(frog1.toText());

  Frog frog2 = new Frog("Zollo");
   System.out.println(frog1.toText());

  Goldfish goldfish1 = new Goldfish("Crimson");
   System.out.println(goldfish1.toText());

  Goldfish goldfish2 = new Goldfish("Casper");
   System.out.println(goldfish2.toText());

  Whale whale1 = new Whale("Baja");
   System.out.println(whale1.toText());

  Whale whale2 = new Whale("Bally");
   System.out.println(whale2.toText());

 }
}

