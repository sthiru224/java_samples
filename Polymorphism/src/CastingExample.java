
public class CastingExample {
	
	public static void main(String[] args) {

		/*
		 * Upcasting refers to taking an object of a lower level class type 
		 * and referencing it to a class of a higher level. 
		 * In this example Fox and Dog are lower level 
		 * and Animal is in the upper level.
		 * So, instead of declaring myFox as Fox object 
		 * and myDog as Dog object as below
		 * 		Fox myFox = new Fox();
		 * 		Dog myDog = new Dog();
		 * they have been declared as Animal objects. 
		 */
		
		// Upcasting is done automatically
        Animal myFox = new Fox();	// Upcasting
        Animal myDog = new Dog();	// Upcasting

        // Downcasting must be done manually
        Fox yourFox = (Fox) myFox; // Downcasting
        Dog yourDog = (Dog) myDog; // Downcasting
        
        
        /* speak() method is an example of Polymorphism 
         * as it is implemented in differently between Fox vs Dog Classes
         * 
         */

        System.out.println("myFox : " + myFox.speak()); // Will print `What does the fox say?`
        System.out.println("myDog : " + myDog.speak()); // Will print `The dog says woof!`

        System.out.println("yourFox : " + yourFox.speak()); // Will print `What does the fox say?`
        System.out.println("yourDog : " + yourDog.speak()); // Will print `The dog says woof!`
	}

}
