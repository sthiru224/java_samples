//Interfaces are not classes, however, and an interface can extend more than one parent interface.
//The extends (Note: not implements) keyword is used once, and the parent interfaces are declared in a comma-separated list.

interface WaterLiveableAdoptable extends WaterLiveable,Adoptable {
	public boolean isWaterLiveableAdoptable();

}
