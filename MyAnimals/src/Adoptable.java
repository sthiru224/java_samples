/*
1) Abstract class can have abstract and non-abstract methods.
	Interface can have only abstract methods. 
	Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.
   Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.
	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.
   Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.
   The interface keyword is used to declare interface.
6) Example:
	public abstract class Shape{
		public abstract void draw();
	}

	Example:
	public interface Shape{
		void draw();
	}

*/

interface Adoptable 
{
	public boolean isAdoptable();
	public String getHomecareInstructions();
 }
