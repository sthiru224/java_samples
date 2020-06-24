/*
 * In order to show that a class relates to another, 
 * we use the extends keyword.  
 * Here is an example of a class (called ) that extends a  class SuperClass
 * as its super class
 * 
 * We can call the constructor of our superclass directly 
 * from our subclass by using the key work super as in this example.
 * 
 *** Notes ***
 * Subclasses inherit all of the public and protected instance methods of the parent class.
 * Subclasses inherit all of the public and protected instance and class variables.
 * Subclasses can have their own instance variables.
 * Subclasses can have their own static and instance methods.
 * Subclasses can override the parent class's methods.
 * Subclasses can contain constructors that directly invoke the parent class's constructor using the super keyword.
 *** Overriding ***
 * Method Overriding allows us to use the same method across multiple objects,
 * with differing implementations. 
 */
public class SubClass extends SuperClass
{
     // Class constructor
     public SubClass(int sideLength)
     {
          // Call the class constructor for `SuperClass` using `super`
          super(sideLength, sideLength);
     }
}