public class Course {
    private String name;

    private Student[] roster;
    private int maxStudents;
    private static int numberOfStudents = 0;

    public Course(String name, int maxStudents) {
        setName(name);
        setMaxStudents(maxStudents);
        // ADD CODE HERE (IF NECESSARY)
        roster = new Student[maxStudents];
    }

    public int getMaxStudent() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if(maxStudents > 0) {
            this.maxStudents = maxStudents;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public boolean addStudent(Student s) {
        //IMPLEMENT THIS METHOD
        /* int counter2 = 0;
        for(int i = 0; i<5; i++){
        if (roster[i] != null)
            counter2++;
            }
        if (counter2 != 5) {
        roster[counter++] = s;
        return true;
        }else   
        return false;
        */
        if (numberOfStudents != maxStudents){
        roster[numberOfStudents++] = s;
        return true;
        }
        else {
        return false;
        }
    }
    public boolean dropStudent(Student s) {
        // IMPLEMENT THIS METHOD
        /*int counter2 = 5;
        for(int i = maxStudents; i>0; i--){
        if (roster[i] != null)
            counter2--;
            }
        if (counter2 != 0) */
        if (numberOfStudents != 0){
        roster[numberOfStudents--] = null;
        return true;
        } else {        
        return false;
        }
}
        @Override
    public String toString() {
        // IMPLEMENT THIS METHOD
        return "Roster:" + roster[0] + "\n" + roster[1]+ "\n" + roster[2] + "\n"
        + roster[3]+ "\n" + roster[4]+ "\n";
        }
}
