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
class  TestClass
{
	public static void main(String[] args) 
	{
		System.out.println("Creating a new Class now");
		// 1. creates six students
			Student[] newStudents ; 

			newStudents = new Student[5]; 

		// 5. adds the first five students to the course
			newStudents[0] = new Student("Andrew", "D0001",true);
			newStudents[1] = new Student("Peter", "D0002",true);
			newStudents[2] = new Student("Mark", "D0003",true);
			newStudents[3] = new Student("Liza", "D0004",true);
			newStudents[4] = new Student("Michael", "D0005",true);
			for (int i = 0; i < newStudents.length; i++){
					System.out.println(newStudents[i].toString());
			}
	}
}
