import java.util.Locale;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter program name: ");
        this.programName = sc.nextLine();
        System.out.println("Enter student number: ");
        this.studentNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter first name: ");
        super.firstName = sc.nextLine();
        System.out.println("Enter last name: ");
        super.lastName = sc.nextLine();
        System.out.println("Enter email ID: ");
        super.emailId = sc.nextLine();
        System.out.println("Enter phone number: ");
        super.phoneNumber = sc.nextLong();
    }

    /* reads number of courses
    loops for number of courses to read each mark 
    calls calculateGpa() */
    public void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of courses: ");
        int k = sc.nextInt();
        double[] marks = new double[k];
        for (int i = 1; i <= k; i++) {
            System.out.println("Enter mark " + i + ": ");
            marks[i - 1] = sc.nextDouble();
        }
        calculateGpa(marks);
    }

    /* method to calculate the gpa of a student 
    assigns calculated mark to this.gpa 
    convert from percentage to 4.0 scale using x/20 - 1 
    average all results for final gpa */
    private void calculateGpa(double[] marks) {
        double grd = 0.0;
        for (int i = 0; i < marks.length; i++) {
            grd += (marks[i]/20) - 1;
        }
        this.gpa = grd/marks.length;
    }

    /* Specifc method to print name, std num, phone, email, program 
    formatted with printf */
    public void printInfo() {
        System.out.printf(Locale.CANADA, "%10s|%8d|%15s|%15s|%15d|%5.2f|", this.programName, this.studentNumber, super.firstName + " " + super.lastName, super.emailId, super.phoneNumber, this.gpa);
    }

}
