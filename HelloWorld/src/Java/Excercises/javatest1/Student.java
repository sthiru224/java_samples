import java.util.*;

/* 
Part 1- The Student Class (10 points)

	Write a class called Student. A student is described by:
		a name
		an ID (text-based, such as "A146")
		whether or not tuition is paid
	Write a constructor, getters and setters, and a toString method for this class.

*/

public class Student
{
    private String name, id;
	private	Boolean tuitionFeesPaid;

	 // 1. construct a new student with given fields
	 public Student(String name, String id, Boolean tuitionFeesPaid) {
        this.setName(name);
        this.setId(id);
        this.settuitionFeesPaid(tuitionFeesPaid);
     }


	// 2. Setter Methods for this class
	public void setName(String name){
		this.name = name;
	}

	public void setId(String id){
		this.id = id;
	}

	public void settuitionFeesPaid(Boolean tuitionFeesPaid){
		this.tuitionFeesPaid = tuitionFeesPaid;
	}


	// 3. Getter Methods for this class
    public String getName()
    {
        return name;
    }
	public String getId()
   {
        return id;
    }
    public Boolean getTuitionFeesPaid()
    {
        return tuitionFeesPaid;
    }

	// 4. toString method for this class
	public String toString() {
        //return "Name : " + name + " ID : " + id + " Fees Paid? : " + String.valueOf(tuitionFeesPaid);
         return "Name : " + name + " ID : " + id ;
    }
}