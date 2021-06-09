import java.util.Locale;
import java.util.Scanner;

public class Contractor extends Employee {
    private double hourlyRate;
    private double numHours;

    Contractor(String first, String last, String email,
    long phone, int empNum, double rate, double hours) {
        super(first, last, email, phone, empNum);
        this.hourlyRate = rate;
        this.numHours = hours;
    }

    Contractor() {

    }

    /* call readEmployee from Employee parent then
     read rate and hours worked */
    @Override
    public void readEmployee() {
        super.readEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hourly rate: ");
        this.hourlyRate = sc.nextDouble();
        System.out.println("Enter number of hours worked: ");
        this.numHours = sc.nextDouble();
    }

    /* call printEmployee from Employee parent then 
    print rate and hours in formatted output (printf) */
    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.printf(Locale.CANADA,"%13.2f | %n", this.hourlyRate * this.numHours);
    }
}
