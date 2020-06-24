class Dog extends Animal implements Mammal,Adoptable{
	public Dog(String name) {
		super(name);
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



