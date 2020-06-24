class Frog extends Animal implements Amphibian,Adoptable{
 
	public Frog(String name) {
		super(name);
	}

	public boolean isAdoptable() {
		return true;
	}

	public String getHomecareInstructions() {
		return " is a Frog and its Home Care Instructions are as listed for Frogs at https://www.lovethatpet.com/small-pets/frogs/";
	}

	public boolean isWarmBlooded(){
	   return false;
	}

	public boolean isAmphibian(){
		return true; 
	}
}

