package Animals;

public class PkgDriverProgram {
	 
	 public static void main(String[] args) {

	  Dog dog1 = new Dog("Max");
	  System.out.println(dog1.toString() + dog1.getHomecareInstructions() + " Mammal : " + dog1.isMammal() + " and Adoptable : " + dog1.isAdoptable()  + " and Warmblooded : " + dog1.isWarmBlooded() );


	  Dog dog2 = new Dog("Bailey ");
	  System.out.println(dog2.toString() + dog2.getHomecareInstructions() + " Mammal : " + dog1.isMammal() + " and Adoptable : " + dog1.isAdoptable()  + " and Warmblooded : " + dog1.isWarmBlooded() );

	  
	  Frog frog1 = new Frog("Hypnotoad");
	  System.out.println(frog1.toString() + frog1.getHomecareInstructions() + " Adoptable : " + frog1.isAdoptable() + " and Amphibian : " + frog1.isAmphibian()  + " and Warmblooded : " + frog1.isWarmBlooded() );

	  Frog frog2 = new Frog("Zollo");
	  System.out.println(frog2.toString() + frog2.getHomecareInstructions() + " Adoptable : " + frog2.isAdoptable() + " and Amphibian : " + frog2.isAmphibian()  + " and Warmblooded : " + frog2.isWarmBlooded() );


	  Goldfish goldfish1 = new Goldfish("Crimson");
	  System.out.println(goldfish1.toString() + goldfish1.getHomecareInstructions() + " Adoptable : " + goldfish1.isAdoptable() + " and WaterLiveable : " + goldfish1.isWaterLiveable()  + " Can Live on Land : " + goldfish1.canLiveOnLand() + " and Warmblooded : " + goldfish1.isWarmBlooded() );

	  Goldfish goldfish2 = new Goldfish("Casper");
	  System.out.println(goldfish2.toString() + goldfish2.getHomecareInstructions() + " Adoptable : " + goldfish2.isAdoptable() + " and WaterLiveable : " + goldfish2.isWaterLiveable()  + " Can Live on Land : " + goldfish2.canLiveOnLand() + " and Warmblooded : " + goldfish2.isWarmBlooded() );

	  Whale whale1 = new Whale("Baja");
	  System.out.println(whale1.toString() + " is a whale. Mammal : " + whale1.isMammal() + " and WaterLiveable : " + whale1.isWaterLiveable()  + " Can Live on Land : " + whale1.canLiveOnLand() + " and Warmblooded : " + whale1.isWarmBlooded() );

	  Whale whale2 = new Whale("Bally");
	  System.out.println(whale2.toString() +  " is a whale. Mammal : " + whale2.isMammal() + " and WaterLiveable : " + whale2.isWaterLiveable()  + " Can Live on Land : " + whale2.canLiveOnLand() + " and Warmblooded : " + whale2.isWarmBlooded() );

	 }
	}


