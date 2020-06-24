abstract class Animal {
	private String name = null;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public abstract boolean isWarmBlooded();

	public String toString() {
		return "Name is: " + name;
	}
}
 
