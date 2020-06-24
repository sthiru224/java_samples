/*
	Part 5- Driver Program (20 points)

		Write a driver program that does the following (in this order). 
		Note that your driver program is not interactive with the user.

			1. creates six students
			2. creates a course that can hold five students
			3. prints the course
			4. prints the roster
			5. adds the first five students to the course
			6. tries to add the sixth student and prints a message if any add fails
			7. prints the roster
			8. drops the third student from the course
			9. prints the roster
			10. tries again to add the sixth student to the course
			11. prints the roster
*/
class  NewClass
{
	public static void main(String[] args) 
	{
		System.out.println("Creating a new Class now");
		// 1. creates six students
			Student[] newStudents ; 
		// 2. creates a course that can hold five students
		    Course javaProgrammingCourse = new Course("Java Programming", 5); 

		// 3. prints the course
			System.out.println("New Course Name and the MaxCapacity  : " + javaProgrammingCourse.toString());

		// 4. prints the roster
			System.out.println("Current Roster Begin: \n");
			javaProgrammingCourse.toString();
			System.out.println("Current Roster End: \n");

			newStudents = new Student[6]; 

		// 5. adds the first five students to the course
			newStudents[0] = new Student("Andrew","Andrew", "D0001",true);
			newStudents[1] = new Student("Peter","Andrew", "D0002",true);
			newStudents[2] = new Student("Mark", "Andrew","D0003",true);
			newStudents[3] = new Student("Liza", "Andrew","D0004",true);
			newStudents[4] = new Student("Michael", "Andrew","D0005",true);
			for (int i = 0; i < 5; i++){
					javaProgrammingCourse.addStudent(newStudents[i]);
			}
		// Print the roster
			javaProgrammingCourse.toString();
		// 6. tries to add the sixth student and prints a message if any add fails
			newStudents[5] = new Student("DonotAdd", "D0006",true);
			System.out.println(" \n New Student Name " + newStudents[5].name + " ID: " +  newStudents[5].id);
			javaProgrammingCourse.addStudent(newStudents[5]);
			System.out.println(" \n Added a New Student");

		// 7. Print the roster
			javaProgrammingCourse.printRoster();
/*
		// 8. drops the third student from the course
			javaProgrammingCourse.dropStudent(newStudents[2]);
		// 9. Print the roster
			javaProgrammingCourse.printRoster();
		// 10. tries again to add the sixth student to the course
			javaProgrammingCourse.addStudent(newStudents[5]);
		// 11. prints the roster
			javaProgrammingCourse.printRoster();
*/
	}
}
