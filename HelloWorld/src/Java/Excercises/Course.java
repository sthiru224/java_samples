import java.util.*;

/* 
	Part 2- The Course Class (10 points) 

	Write a class called Course to represent a college class. A course is described by:

	a name
	the maximum students that can be enrolled in the course

	Write a constructor, getters and setters (using appropriate validity checks), and a toString method.

*/

/*
	Part 3- The Roster (10 points)

	Add a roster to the Course class. A roster is represented by an array of Student objects.

	Add instance data and code to the constructor to represent the roster.

	(You do not need to add a getter and setter. The methods below will allow an outside class to access the roster appropriately.)
*/

public class Course
{
    private String name;
	private	Integer maxStudents;
	// Add a roster to the Course class. A roster is represented by an array of Student objects.
	private Student[] roster;
	private Integer numberEnrolled=0;

	 // 1. construct a new Course with the given fields
	 public Course(String name, Integer maxStudents) {
        this.setName(name);
        this.setMaxStudents(maxStudents);
		// Add instance data and code to the constructor to represent the roster.
		this.roster=new Student[maxStudents];
		this.numberEnrolled=0;
	 }

	// 2. Setter Methods for this Course class
	public void setName(String name){
		this.name = name;
	}

	public void setMaxStudents(Integer maxStudents){
		this.maxStudents = maxStudents;
		this.numberEnrolled=0;
	}


	// 3. Getter Methods for this Course class
    public String getName()
    {
        return name;
    }
	public Integer getMaxStudents()
   {
        return maxStudents;
    }

	public Integer getNumberEnrolled()
   {
        return numberEnrolled;
    }

	// 4. toString method for this Course class
		public String toString() {
        return "Name of the Course : " + name + " Capacity : " + maxStudents + " Current Strength : " + numberEnrolled;
    }
	
	// 5. Print the list of students enrolled in this Course  
	public Student[] getCourseRoster()
	{
		return this.roster;
	}

/*
Part 4- Course Methods (50 points)

Write the following 3 methods in the Course class:

	public boolean addStudent(Student s)
		if there is room for the student, add the student to the roster and return true
		return false otherwise

	public boolean dropStudent(Student s)
		if the student is currently in the roster, remove them from the roster and return true
		return false otherwise

		Note: There are different approaches to implementing this method. Any approach is fine, 
			  but be sure to test your method thoroughly considering lots of different possible cases. 
			  (Use your driver program for this!)

	public void printRoster()
		print how many students are enrolled in the course; print an appropriate message if there are no students yet enrolled
		print the list of each student on a single line (use good object-oriented principles to access a text representation of each student!)

*/

  public boolean addStudent(Student s) {
	// public boolean addStudent(Student s)
			// Debug : System.out.println("numberEnrolled : " + this.numberEnrolled + "    roster.length : " + roster.length); 
			// if there is room for the student, add the student to the roster and return true
			if (this.numberEnrolled < roster.length){
						// Debug : System.out.println(" Adding the new student at : " + this.numberEnrolled);
						roster[this.numberEnrolled] = s;
						this.numberEnrolled++;
						// Debug : System.out.println(" Next student will be added at : " + this.numberEnrolled);
						return true;
					}
					else
					{
						System.out.println("Sorry! This course : " + this.name + " is full"); 
						return false;
					}
  }

	public boolean dropStudent(Student s) {

	  // public boolean dropStudent(Student s)
			// if the student is currently in the roster, remove them from the roster and return true

			Integer studentFound=0;
			Student[] copyRoster;
			copyRoster = new Student[roster.length];
			if (this.numberEnrolled != 0){
				for (int i = 0; i < this.numberEnrolled; i++)
				{
					if (this.roster[i].getId() == s.getId())
					{
						studentFound=1;
						System.arraycopy(roster, 0, copyRoster, 0, i);
						System.arraycopy(roster, i+1, copyRoster, i, roster.length-i-1);
						roster=copyRoster;
						this.numberEnrolled--;
						return true;
					}

				}
						// return false if the student ID is not found in the list
						if (studentFound != 1){
								System.out.println("There is no such student in the roster with ID " + s.getId() ); 
								return false;
						}
			// return false if the roster is empty
			} else {        
				return false;
			}
	return true;
	}

public void printRoster()
	// public void printRoster()
	//	print how many students are enrolled in the course; print an appropriate message if there are no students yet enrolled
	//	print the list of each student on a single line (use good object-oriented principles to access a text representation of each student!)
	{
			Integer counter=0;
			// System.out.println("List of students."); 
			if (this.numberEnrolled==0)
			{
				System.out.println(" >>>>>>>  Roster is Empty : There are no students enrolled yet."); 
					return;
			}
			System.out.println("------------------------------------------------");
			System.out.println("Serial No.     | Student ID      |  Student Name ");
			System.out.println("------------------------------------------------");
			for (int i = 0; i < this.numberEnrolled; i++) {
					counter++;
					System.out.println("           " + counter + "   |   " + roster[i].getId() + "         |      " + roster[i].getName());
				}
			System.out.println("-------------------------------------------------");
	}

}