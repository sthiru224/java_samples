import java.util.Arrays;

// Practice problem 
public class Student{ 
int  ID; // will be positive 
int  yr;  // will be 9 - 12 inclusive 
double gpa;// non-negative 
String  lastName; 
String  firstName; 
 
public Student(int i, int j, int k, String string, String string2) {
	// TODO Auto-generated constructor stub
	ID=i;
	yr=j;
	gpa=k;
	lastName = string;
	firstName = string2;
}
// getters for each private data member 
public int getID(){  return ID;} 
public int getYr(){  return yr;} 
public  double getGPA(){  return gpa;} 
public   String getLast() {  return lastName;} 
public  String  getFirst() {  return firstName; } 


/*
Assume we have an array of Student Objects which contains at least 1 student. 
0.  Write the method findStudent(Student[] arr, int ID) which returns the index of the Student with the specified ID.  If no Student can be found 
in the array with that ID, then -1 is returned. 
// this method searches for the Student with the input ID.  There may be nulls in the array.  If no Student object can be found with  
// the specified ID, then -1 is returned. 
public int findStudent(Student[] arr, int ID){ } 
*/

public  void printStudents(Student[] arr) {

	for (int i=0; i< arr.length;i++) {
	    if (arr[i]!= null)
	    {
	        System.out.println("S.No : " + i + "  ID : " + arr[i].getID() + " Year : " + arr[i].getYr() + " GPA : " + arr[i].getGPA() +  " Last Name : " +   arr[i].getLast()+ " First Name : " + arr[i].getFirst());
	    }
	}

}
	
	
public   int findStudent(Student[] arr, int ID) {
	
	for (int i=0; i< arr.length;i++) {
	    if ((arr[i]!= null) && (arr[i].getID() == ID))
	    {
	        return(i);
	    }
	}
	return -1;
}

/*
1.  Write the method findMaxGPA() which returns the index of the Student with the max GPA in list. 
//@param arr  has  at least one non-null student in the array.  
//@return the index of the Student with the max GPA in the array.   
//The array MIGHT have NULL elements!!!!!  How would you write code that addresses this fact?  This is important!!! 
*/
public  int findMaxGPA(Student[]  arr){ 
	double current_maxGPA = -1;
	int current_maxIndex = -1;
	for (int i=0; i< arr.length;i++) {
	    if ((arr[i]!= null) && (arr[i].getGPA() > current_maxGPA)) {
	    		current_maxGPA = arr[i].getGPA();
	    		current_maxIndex = i;
	    }
	}
	return current_maxIndex;    
}

/*
2.  Write the method findMinID() which returns the min ID# of the students in the array. 
//Precondition:  There is at least one student in the array.   
//@returns the index of the Student with the max array.  The array MIGHT 
//have NULL spots in the array!!!!!  How would you write code that addresses this fact?  This is important!!! 
public int findMinID( Student[] arr){ 

} 
*/

public int findMinID(Student[] arr) {
	int current_minID = 99999;
	for (int i=0; i< arr.length;i++) {
	    if ((arr[i]!= null) && (arr[i].getID() < current_minID)) {
	    		current_minID = arr[i].getID();
	    }
	}
  	return current_minID;    
}


/*
4.  Write the method sortAlpha() which returns a new array of Student ordered by the last name alphabetically. 
//The array has a length of at least 1.   Returns the Student with the highest name alphabetically.  If the array contains only  
//null students, then null will be returned.  The array MIGHT have NULL objects!!!!!   
//How would you write code that addresses this fact?  This is important!!! 
*/

public Student[]  sortAlpha( Student[] arr){ 
	Student temp;
	for (int i = 0; i < arr.length; i++)
	{
	    for (int j = i + 1; j < arr.length ; j++)
	    {
	        if ((arr[i]!= null) && (arr[j]!= null) && (arr[i].getLast().compareTo(arr[j].getLast())) >0){
	            temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	}
return(arr);
} 

/*
5.  Write the method topTen() which returns an array of the top 10 students according to GPA. 
// You must use the method findMaxGPA from #1.  You then may remove that student from the original array by placing null at that // location.   
public Student[]  topTen( Student[] arr){ 
} 
*/

public Student[]  topTen( Student[] arr){ 
	
	Student[] newArr = new Student[10];
	for (int i = 0; i <= 9; i++)
	{
		int j = findMaxGPA(arr) ;
		newArr[i] = arr[j];
		arr[j] = null;
	}
return(newArr);
} 




/*
6.  Write the method num4PointOs(Student[]  arr)  which returns the number of students with GPA >=4.0 
// returns the number of students in list with gpa >= 4.0 
public   int   num4PointOs(Student[]  arr){ 
} 
*/

public int num4PointOs(Student[] arr) {
	int countGPA =0;	
	for (int i=0; i< arr.length;i++) {
	    if ((arr[i]!=null) && (arr[i].getGPA() >= 4)){
	    		countGPA++;
	    }
	}
	return countGPA;
}


public Student findLastAlpha(Student[] arr) {
	Student first = arr[0];	
	for (int i=1; i< arr.length-1;i++) {
		System.out.println( " First's Last Name : " + first.lastName + " : " + arr[i].getLast());
	    if ( first.getLast().compareTo(arr[i].getLast()) < 0){
	    		first = arr[i];
	    }
	}
	return first;
}


	

public static void main(String[] args) 
	{
		Student[] myArr = new Student[20];
		Student[] myOriginalArr = new Student[20];
		Student[] myNewArr = new Student[20];
		Student myStudent,myStudent1;
		myStudent = new Student(7,9,4,"Lname0","Fname0"); myArr[0] = myStudent;
		myStudent = new Student(2,9,3,"Lname1","Fname1"); myArr[1] = myStudent;
		myStudent = new Student(3,9,4,"Lname2","Fname2"); myArr[2] = myStudent;
		myStudent = new Student(4,9,5,"Lname3","Fname3"); myArr[3] = myStudent;
		myStudent = new Student(5,9,4,"Lname4","Fname4"); myArr[4] = myStudent;
		myStudent = new Student(6,9,2,"Lname5","Fname5"); myArr[5] = myStudent;
		myStudent = new Student(20,9,1,"Lname6","Fname6"); myArr[6] = myStudent;
		myStudent = new Student(8,9,3,"Lname7","Fname7"); myArr[7] = myStudent;
		myStudent = new Student(9,9,2,"Lname8","Fname8"); myArr[8] = myStudent;
		myStudent = new Student(10,9,3,"Lname9","Fname9"); myArr[9] = myStudent;
		myStudent = new Student(11,9,2,"Lname10","Fname10"); myArr[10] = myStudent;
		myStudent = new Student(12,9,1,"Lname11","Fname11"); myArr[11] = myStudent;
		myStudent = new Student(13,9,3,"Lname12","Fname12"); myArr[12] = myStudent;
		myStudent = new Student(14,9,4,"Lname13","Fname13"); myArr[13] = myStudent;
		myStudent = new Student(15,9,4,"Lname14","Fname14"); myArr[14] = myStudent;
		myStudent = new Student(16,9,2,"Lname15","Fname15"); myArr[15] = myStudent;
		myStudent = new Student(17,9,2,"Lname16","Fname16"); myArr[16] = myStudent;
		myStudent = new Student(18,9,3,"Lname17","Fname17"); myArr[17] = myStudent;
		myStudent = new Student(19,9,1,"Lname18","Fname18"); myArr[18] = myStudent;
		/*
		public int findStudent(Student[] arr, int ID) {
		public  int findMaxGPA(Student[]  arr){ 
		public int findMinID(Student[] arr) {
		public Student[]  sortAlpha( Student[] arr){ 
		public Student[]  topTen( Student[] arr){ 
		public int num4PointOs(Student[] arr) {
		*/
		myOriginalArr = myArr.clone();
		myStudent.printStudents(myArr) ;
		System.out.println(" Student ID : 10 exits at " + myStudent.findStudent(myArr,10));
		System.out.println("Max GPA is at Index " + myStudent.findMaxGPA(myArr));
		System.out.println(" Student Min ID : " + myStudent.findMinID(myArr));
		myArr = myStudent.sortAlpha(myArr);
		System.out.println(" All Students Sort by Last Name " );
		myStudent.printStudents(myArr) ;
		
		myNewArr = myStudent.topTen(myArr);
		System.out.println(" Top 10 Students " );
		myStudent.printStudents(myNewArr) ;
		System.out.println(" All Students " );
		myStudent.printStudents(myOriginalArr) ;
		System.out.println(" Number of Os " + myStudent.num4PointOs(myOriginalArr) );
		myStudent1  = myStudent.findLastAlpha(myOriginalArr);
		
		
		System.out.println( myStudent1.getLast());
	}
}
