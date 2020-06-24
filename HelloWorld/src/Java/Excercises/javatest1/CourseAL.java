import java.util.*;

/*
Part 6 Extra Credit (20 points)

Write a class called CourseAL. This class has the same methods as Course. 
But, instead of using a Student[] to store the roster, use an ArrayList<Student>. 
Re-write the Course methods to work with the ArrayList. 
Take advantage of the methods provided in the ArrayList class!

Standard Java arrays are of a fixed length. After arrays are created, they cannot grow or shrink, 
which means that you must know in advance how many elements an array will hold.

Arraylists are created with an initial size. When this size is exceeded, the collection is automatically enlarged. 
When objects are removed, the array may be shrunk.

*/

public class CourseAL
{
    private String name;
	private	Integer maxStudents;
	// Add a roster to the Course class. A roster is represented by an array of Student objects.
	// private Student[] roster;
	private ArrayList<Student>  roster ;
	private Integer numberEnrolled=0;

	 // 1. construct a new Course with the given fields
	 public CourseAL(String name, Integer maxStudents) {
        this.setName(name);
        this.setMaxStudents(maxStudents);
		// Add instance data and code to the constructor to represent the roster.
		// this.roster=new Student[maxStudents];
		this.roster = new ArrayList<Student>(1);
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
	public ArrayList getCourseRoster()
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
					if (roster.size() < maxStudents)
					{
						 if (roster.contains(s))
							{
								System.out.println("This Student already exists in the roster"); 
								return false;
						    } 
						 else

						 {
								roster.add(s);
								this.numberEnrolled++;
								return true;
						}

					}	
					else
					{
						System.out.println("Sorry! This course : " + this.name + " is full"); 
						return false;
					}
}

public boolean dropStudent(Student s) {
		if (roster.size()!= 0){
			 if (roster.contains(s))
			 {
				 roster.remove(s);
				 return true;
			 }
			 else
			{
				System.out.println(" There is no such student with " + s.toString() + " in the roster");
				return false;
			 }
		}
		else 
		{
				System.out.println(" >>>>>>>  Roster is Empty : There is no such student with " + s.toString() + " in the roster");
				return false;
		}
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
			// Alternate : 
			// System.out.println(roster);
			for (int i = 1; i < roster.size(); i++) {
					System.out.println("           " + i + "   |   " + roster.get(i).getId() + "         |      " + roster.get(i).getName());
			}
			System.out.println("-------------------------------------------------");
	}

}