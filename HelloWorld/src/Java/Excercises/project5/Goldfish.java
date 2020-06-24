class Goldfish extends Animal implements WaterLiveable,Adoptable{
 
	public Goldfish(String name) {
		super(name);
	}

	public boolean isAdoptable() {
		return true;
	}

	public String getHomecareInstructions() {
		return " is a Goldfish : Home Care Instructions are as listed for Goldfish at http://www.wikihow.com/Take-Care-of-Goldfish ";
	}

	public boolean isWaterLiveable(){
		return true;
	} 

	public boolean canLiveOnLand(){
		return false;
	} 

	public boolean isWarmBlooded(){
	   return false;
   }

}


