/*

An interface is a reference type in Java. It is similar to class. 
It is a collection of abstract methods. 

A class implements an interface, thereby inheriting the abstract methods of the interface.

An interface is similar to a class in the following ways −

	An interface can contain any number of methods.
	
	An interface is written in a file with a .java extension, with the name of the 
	interface matching the name of the file.
	
	The byte code of an interface appears in a .class file.
	
	Interfaces appear in packages, and their corresponding bytecode 
	file must be in a directory structure that matches the package name.

However, an interface is different from a class in several ways, including −

	You cannot instantiate an interface.
	An interface does not contain any constructors.
	All of the methods in an interface are abstract.
	An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
	An interface is not extended by a class; it is implemented by a class.
	An interface can extend multiple interfaces.

*/
interface Mammal 
{
	public boolean isMammal();
 }