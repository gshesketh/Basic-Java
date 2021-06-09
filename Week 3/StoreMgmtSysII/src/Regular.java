import java.util.Locale;
import java.util.Scanner;

public class Regular extends Employee {
    private double salary;

    Regular(String first, String last, String email, long phone, int empNum,
    double sal) {
        super(first, last, email, phone, empNum);
        this.salary = sal;
    }

    Regular() {

    }

    /* Calls readEmployee from super class Employee then reads salary type
    and converts to monthly before storing it in salary instance var. */
    @Override
    public void readEmployee() {
        super.readEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter annual salary: ");
        this.salary = sc.nextDouble()/12;
    }

    /* Calls printEmployee from super Employee then prints the salary info
    using printf. */
    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.printf(Locale.CANADA,"%12d | %20s | %20s | %12d | %12.2f | %n", super.employeeNumber, super.getName(), 
        super.email, super.phoneNumber, this.salary);
    }
}
