import java.util.Locale;
import java.util.Scanner;
public class Employee extends Person {
    protected int employeeNumber;

    /* Constructeur qui initialise un employé qui est aussi un objet Person */
    Employee(String first, String last, String email, long phone, int empNum) {
        super(first, last, email, phone);
        this.employeeNumber = empNum;
    }

    Employee() {

    }

    /* Lit l'information de l'employé */
    public void readEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee number: ");
        this.employeeNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee first name: ");
        this.firstName = sc.nextLine();
        System.out.println("Enter employee last name: ");
        this.lastName = sc.nextLine();
        System.out.println("Enter employee email: ");
        this.email = sc.nextLine();
        System.out.println("Enter employee phone number: ");
        this.phoneNumber = sc.nextLong();
    }

    /* Imprime l'information de manière formattée à l'aide de printf */
    public void printEmployee() {
        System.out.printf(Locale.CANADA,"%12d | %20s | %20s | %12d |", this.employeeNumber, super.getName(), 
        this.email, this.phoneNumber);
    }
}
