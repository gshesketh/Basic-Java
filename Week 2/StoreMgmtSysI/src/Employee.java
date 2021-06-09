import java.util.Locale;
import java.util.Scanner;
public class Employee {

    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String emailId;
    private long phoneNumber;
    private double salary;

    /*Constructor pour objet employee sans le salaire.*/
    Employee(int empNum, String first, String last, String email, long phone) {
        this.employeeNumber = empNum;
        this.firstName = first;
        this.lastName = last;
        this.emailId = email;
        this.phoneNumber = phone;
    }

    /* Constructeur par défaut sans args */
    Employee() {

    }

    /*Lit l'information des objets Employee*/
    public void readEmployeeInfo() {
        Scanner sc = new Scanner(System.in);    /* Ne peut pas utiliser sc.close() avec system.in puisque ça le ferme indéfiniment. */
        System.out.println("Enter employee number: ");
        this.employeeNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee first name: ");
        this.firstName = sc.nextLine();
        System.out.println("Enter employee last name: ");
        this.lastName = sc.nextLine();
        System.out.println("Enter employee email: ");
        this.emailId = sc.nextLine();
        System.out.println("Enter employee phone number: ");
        this.phoneNumber = sc.nextLong();
        readSalary();
    }

    public void readSalary() {
        double annual = 0.0;
        double monthly = 0.0;
        double rate = 0.0;
        double worked = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.. Regular");
        System.out.println("2.. Contract");
        System.out.println("Enter type of employee: ");
        int salaryType = sc.nextInt();
        if (salaryType == 1) {
            System.out.println("Enter annual salary: ");
            annual = sc.nextDouble();
            monthly = annual/12;
        }
        else {
            System.out.println("Enter hourly rate: ");
            rate = sc.nextDouble();
            System.out.println("Enter number of hours worked: ");
            worked = sc.nextDouble();
            monthly = rate * worked;
        }
        this.salary = monthly;
    }

    public void printEmployee() {
        System.out.printf(Locale.CANADA,"%12d | %20s | %20s | %12d | %12.2f | %n", this.employeeNumber, this.firstName + " " + this.lastName, 
        this.emailId, this.phoneNumber, this.salary);
    }
}
