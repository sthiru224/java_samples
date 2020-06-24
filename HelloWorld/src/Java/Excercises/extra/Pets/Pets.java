
public class Pets {
	private String name;
	private int age;
	private boolean indoor;

	public void Pet(String n, int a, boolean i) {
		this.name = n;
		this.age = a;
		this.indoor = i;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean getIndoor() {
		return indoor;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setIndoor(boolean i) {
		indoor = i;
	}
	
	//tostring
}
