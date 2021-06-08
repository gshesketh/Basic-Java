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

    Employee() {

    }

    /*Lit l'information des objets Employee*/
    public void readEmployeeInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee number: ");
        this.employeeNumber = sc.nextInt();
        System.out.println("Enter employee first name: ");
        this.firstName = sc.nextLine();
        System.out.println("Enter employee last name: ");
        this.lastName = sc.nextLine();
        System.out.println("Enter employee email: ");
        this.emailId = sc.nextLine();
        System.out.println("Enter employee phone number: ");
        this.phoneNumber = sc.nextLong();
        sc.close();
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
        sc.close();
        this.salary = monthly;
    }

    public void printEmployee() {
        System.out.printf("%d %s %s %s %d %d", this.employeeNumber, this.firstName, this.lastName, this.emailId, this.phoneNumber, this.salary);
    }
}
