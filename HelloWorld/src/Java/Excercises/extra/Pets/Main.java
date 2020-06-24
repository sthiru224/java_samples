import java.util.*;
public class Main {
	public static void main(String args[]) {

// Using Array 
		System.out.println("----------------------------------------------");  
		System.out.println("---------------- Using Array -----------------");  
		System.out.println("----------------------------------------------");  
		
		Pets[] Pets = new Pets[6];
		Pets[0] = new Cat();
		Pets[1] = new Dog();
		Pets[0].setName("Array Cat One");
		Pets[1].setName("Array Dog One");
		String s; 

		for (int i = 0; i < Pets.length; i++) {
			if(Pets[i] != null){
				s = Pets[i].toString();
				System.out.print("Object : " + s);
				if (Pets[i].getIndoor() == false) {
					System.out.println(" : Name   : " + Pets[i].getName());
				} //if

			} // if 

		} //for 


// Using Collection : ArrayList

		System.out.println("----------------------------------------------");  
		System.out.println("-------- Using Collection : ArrayList --------");  
		System.out.println("----------------------------------------------");  

		ArrayList<Pets> petsList = new ArrayList<Pets>();
		Pets Catx = new Cat();
		Catx.setName("ArrayList Cat One");
		petsList.add(Catx);

		Pets Dogx = new Dog();
		Dogx.setName("ArrayList Dog One");
		petsList.add(Dogx);


		int i = 0;
		while (i < petsList.size()) {
			System.out.print("Object : " + petsList.get(i).toString());
			System.out.println(" : Name   : " + petsList.get(i).getName());
			i++;
		}

		System.out.println("----------------------------------------------");  
		System.out.println("--Using Collection : ArrayList with Iterator--");  
		System.out.println("----------------------------------------------");  

		Object abc;
		Iterator itr=petsList.iterator();  
		while(itr.hasNext()){ 
			abc = itr.next();
			System.out.print("Object : " + abc.toString());
			System.out.println(" : Name   : " + ((Pets)abc).getName());
		}  
	


	} //main method

} //Main