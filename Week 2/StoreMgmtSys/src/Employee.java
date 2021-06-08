import java.util.Scanner;

public class Employee {
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String emailId;
    private long phoneNumber;
    private double salary;

    /*Constructor pour objet employee sans le salaire.*/
    Employee(int empNum, String fName, String lName, String email, long phone) {
        this.employeeNumber = empNum;
        this.firstName = fName;
        this.lastName = lName;
        this.emailId = email;
        this.phoneNumber = phone;
    }

    /*Lit l'information des objets Employee*/
    public void readEmployeeInfo() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter employee number: ");
        int empNum = console.nextInt();
        System.out.println("Enter employee first name: ");
        String fName = console.nextLine();
        System.out.println("Enter employee last name: ");
        String lName = console.nextLine();
        System.out.println("Enter employee email: ");
        String email = console.nextLine();
        System.out.println("Enter employee phone number: ");
        Long phone = console.nextLong();
        console.close();
        readSalary();
    }

    public void readSalary() {

    }

    public void printEmployee() {

    }
}
