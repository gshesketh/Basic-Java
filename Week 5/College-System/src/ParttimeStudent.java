import java.util.Locale;
import java.util.Scanner;

public class ParttimeStudent extends Student {
    
    private double courseFeesTotal;
    private double credits;

    ParttimeStudent() {

    }

    /* Parameterized constructor */
    ParttimeStudent(String first, String last, String email, long phone, int stdnum, String progName, double gpa, double total, double cred) {
        super(first, last, email, phone, stdnum, progName, gpa);
        this.courseFeesTotal = total;
        this.credits = cred;
    }

    /* calls superclass method to read student info
    then reads for the course fees and credit hours */
    public void readInfo() {
        super.readInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total course fees: ");
        this.courseFeesTotal = sc.nextDouble();
        System.out.println("Enter credit hours: ");
        this.credits = sc.nextDouble();
    }

    /* calls superclass method to print student info
    then adds the course fees and credit hours  */
    public void printInfo() {
        super.printInfo();
        System.out.printf(Locale.CANADA, "%,10.2f|%7.2f|%n", this.courseFeesTotal, this.credits);
    }

}
