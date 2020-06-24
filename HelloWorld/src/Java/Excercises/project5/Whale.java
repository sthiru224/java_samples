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
	public boolean isWarmBlooded(){
	   return true;
   }

}



