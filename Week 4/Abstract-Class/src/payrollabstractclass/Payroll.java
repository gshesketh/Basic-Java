package payrollabstractclass;

import java.util.Scanner;

public class Payroll {
    private Employee[] employees;

    /* Default constructor */
    Payroll() {

    }

    /* Constructor */
    public Payroll(int num) {
        this.employees = new Employee[num];
    }

    /* Read user input of each employee information in employees and instantiate attributes as well as the correct salary type object. */
    public void readEmployees() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.employees.length; i++) {
            int emp = i + 1;
            System.out.println("\nEnter details of employee " + emp);
            System.out.println("===========================");
            System.out.println("Enter first name: ");
            String first = sc.nextLine();
            System.out.println("Enter last name: ");
            String last = sc.nextLine();
            System.out.println("Enter email: ");
            String email = sc.nextLine();
            System.out.println("Hours worked: ");
            double num = sc.nextDouble();
            System.out.println("1.. Regular");
            System.out.println("2.. Contract");
            System.out.println("Enter type of employee: ");
            int salaryType = sc.nextInt();
            sc.nextLine(); /* consumes the \n from nextInt() */
            if (salaryType == 1) { /* regular salary type */
                this.employees[i] = new Regular(first, last, email, num);
            }
            else { /* contract salary type */
                this.employees[i] = new Contractor(first, last, email, num);
            }

        }
    }

    /* Loops through employees to print the payment method associated to each object */
    public void processPayroll() {
        for (int i = 0; i < this.employees.length; i++) {
            employees[i].printPaymentMethod();
        }
    }
}
