public class Student {
    private String firstName, lastName, id;
    private boolean tuitionPaid;

    public Student(String firstName, String lastName, String id, boolean tuitionPaid) {
        setFirstName(firstName);
        setLastName(lastName);
        setID(id);
        setTuitionPaid(tuitionPaid);
    }

    public Student(String firstName, String lastName, String id) {
        this(firstName, lastName, id, true);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public boolean isTuitionPaid() {
        return tuitionPaid;
    }

    public void setTuitionPaid(boolean tuitionPaid) {
        this.tuitionPaid = tuitionPaid;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student otherStudent = (Student) obj;
            return id.equalsIgnoreCase(otherStudent.id);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + id + ")";
    }


}