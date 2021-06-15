import java.util.Locale;
import java.util.Scanner;

public class FulltimeStudent extends Student {

    private double tuitionFees;

    FulltimeStudent() {

    }

    /* Parameterized constructor */
    FulltimeStudent(String first, String last, String email, long phone, int stdnum, String progName, double gpa, double fees) {
        super(first, last, email, phone, stdnum, progName, gpa);
        this.tuitionFees = fees;
    }

    /* Method to read fulltimestudent-specific info
    calls the superclass method then reads tuition fees */
    public void readInfo() {
        super.readInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tuition fees: ");
        this.tuitionFees = sc.nextDouble();
    }

    /* calls superclass method to print info then 
    adds the tuition fees field */
    public void printInfo() {
        super.printInfo();
        System.out.printf(Locale.CANADA, "%,10.2f|%n", this.tuitionFees);
    }
    
}
