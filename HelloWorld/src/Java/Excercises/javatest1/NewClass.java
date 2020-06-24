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
			Student[] newStudents = new Student[6];  
			newStudents[0] = new Student("Andrew", "D0001",true);
			newStudents[1] = new Student("Peter", "D0002",true);
			newStudents[2] = new Student("Mark", "D0003",true);
			newStudents[3] = new Student("Liza", "D0004",true);
			newStudents[4] = new Student("Michael", "D0005",true);
			newStudents[5] = new Student("DonotAdd", "D0006",true);

		// 2. creates a course that can hold five students
		    Course javaProgrammingCourse = new Course("Java Programming", 5); 

		// 3. Print the course
			System.out.println(javaProgrammingCourse.toString());

		// 4. Print the roster
			// Debug : System.out.println("Current Roster Begin: \n");
			System.out.println("List of students in the empty roster..."); 
			javaProgrammingCourse.printRoster();
			// Debug : System.out.println("Current Roster End: \n");

		// 5. Add the first five students to the course
			for (int i = 0; i < 5; i++){
					javaProgrammingCourse.addStudent(newStudents[i]);
			}
		// Print the roster
			System.out.println("List after adding all the five new students in to the roster"); 
			javaProgrammingCourse.printRoster();
		// 6. Try to add the sixth student and prints a message if any add fails
			javaProgrammingCourse.addStudent(newStudents[5]);
		// 7. Print the roster
			System.out.println("List after trying to add a sixth student with name DonotAdd in to the roster"); 
			javaProgrammingCourse.printRoster();
		// 8. Drop the third student from the course
			javaProgrammingCourse.dropStudent(newStudents[2]);
		// 9. Print the roster
			System.out.println("List after deleting the third student with name Mark from the roster"); 
			javaProgrammingCourse.printRoster();
		// 10. Try again to add the sixth student to the course
			System.out.println("Trying to add again....: \n");
			javaProgrammingCourse.addStudent(newStudents[5]);
		// 11. Print the roster
			System.out.println("List after adding the sixth student with name DonotAdd again into the roster"); 
			javaProgrammingCourse.printRoster();
		// 12. Additional Check  - Try again to add the another student to the course
			System.out.println("Trying to add another student ....: \n");
			Student someStudent = new Student("YetAnotherExtra", "D0007",true);;
			javaProgrammingCourse.addStudent(someStudent);
		// Print  the roster
			System.out.println("List after adding the another student with name YetAnotherExtra again into the roster"); 
			javaProgrammingCourse.printRoster();
		// 13. Additional Check  - Try to Drop a non-existing student from the course
			javaProgrammingCourse.dropStudent(someStudent);
		// Print the roster
			System.out.println("List after trying to delete an non-existing student with name YetAnotherExtra from the roster"); 
			javaProgrammingCourse.printRoster();
		//  Empty the roster by dropping all the Students from the roster
			for (int i = 0; i < 6; i++){
					javaProgrammingCourse.dropStudent(newStudents[i]);
				}
		//  Print the roster
		System.out.println("List after deleting all the endrolled students from the roster"); 
		javaProgrammingCourse.printRoster();
		// 14. Additional Check  - Try to Delete someStudent again from the Empty roster...
		System.out.println("Trying to delete a student from the emptry roster"); 
		javaProgrammingCourse.dropStudent(newStudents[0]);
		//  Print the roster
		System.out.println("Final State of the roster"); 
		javaProgrammingCourse.printRoster();
		System.out.println("------------------------ *** Thank You *** -------------------------"); 
		System.out.println("------------------------ *** Abitha Thiru *** ----------------------"); 
		System.out.println("--------------------------------------------------------------------"); 

	}
}
