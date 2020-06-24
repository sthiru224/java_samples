public class BindingExample {
	
	public static void main(String[] args) {

		/*
		 * 
		 * Dynamic Binding is an important concept to runtime polymorphism.
		 * It is the concept of the proper method implementation being chosen
		 * at run-time.
		 * 
		 * Static Binding is another important concept to polymorphism. 
		 * Static binding chooses the proper method implementation 
		 * at compilation, and not run-time. 
		 * Static binding only checks the type of the reference variable 
		 * and not where it is pointing
		 * 
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
	
        // Polymorphic Arrays allow us to store an array of objects 
        // with differing types that share the same superclass.
        
        Animal[] animalArray = new Animal[3];

        // Set each object in the array
        animalArray[0] = new Dog();
        animalArray[1] = new Fox();
        animalArray[2] = new Dog();

        // Print out the array
        for(int i = 0; i < animalArray.length; i++)
        {
            // Will print out the various `speak()` methods for each animal.
            System.out.println("Polymorphic Array : " + i + " : " + animalArray[i].speak());
        }
	
	}

}
