/*
 * Inheritance is when we have two classes that share functionality. 
 * We use inheritance when we want to create a new class, 
 * but utilize existing code from another class. 
 * So, we derive our new class from the existing class. 
 * By doing this, we can utilize methods from the existing class without 
 * having to rewrite code.
 * 
 * The Subclass is the class the extends another class, 
 * or inherits from another class.
 * 
 * The Superclass is the class being utilized by the subclass.
 * It is important to know that the subclass inherits everything 
 * from the super class. This includes: classes, methods, and fields.
 * 
 */

public class SuperClass {
		     int width;
		     int height;

		    // Constructor  
			public SuperClass (int rwidth, int rheight)
				     {
				          width = rwidth;
				          height = rheight;
				     }
			// getArea method 
			public int getArea()
				     {
				          return width * height;
				     }
	}