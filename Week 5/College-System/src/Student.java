public class Student extends Person {
    
    protected int studentNumber;
    protected String programName;
    protected double gpa;

    /* Default constructor */
    Student() {
        super();
    }

    /* Parameterized constructor */
    Student(String first, String last, String email, long phone, int stdnum, String progName, double gpa) {
        super(first, last, email, phone);
        this.studentNumber = stdnum;
        this.programName = progName;
        this.gpa = gpa;
    }

    /* reads name, std num, phon, email, program */
    public void readInfo() {

    }
    /* reads number of courses
    loops for number of courses to read each mark 
    calls calculateGpa() */
    public void readMarks() {

    }

    /* method to calculate the gpa of a student 
    assigns calculated mark to this.gpa*/
    private void calculateGpa(double[] marks) {
        
    }

    /* Specifc method to print name, std num, phone, email, program */
    public void printInfo() {

    }

}
