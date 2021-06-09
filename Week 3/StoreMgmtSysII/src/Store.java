import java.util.Scanner;

public class Store {
    private Employee[] employees;
    private static int k = 89;

    Store(int num) {
        this.employees = new Employee[num];
    }

    /* loop through employee array to determine the employee type
    based on type, create corresponding object 
    then call readEmployee method */
    public void readEmployeeDetails() {
        for (int i = 0; i < this.employees.length; i++) {
            int emp = i + 1;
            Scanner sc = new Scanner(System.in);    /* Ne peut pas utiliser sc.close() avec system.in puisque ça le ferme indéfiniment. */
            System.out.println("Enter details of employee " + emp);
            System.out.println("1.. Regular");
            System.out.println("2.. Contract");
            System.out.println("Enter type of employee: ");
            int salaryType = sc.nextInt();
            if (salaryType == 1) { /* regular salary type */
                this.employees[i] = new Regular();
            }
            else { /* contract salary type */
                this.employees[i] = new Contractor();
            }
            this.employees[i].readEmployee();
        }
        
    }

    /* loop through employees and print details using
    printEmployee */
    public void printEmployeeDetails() {
        System.out.printf("%12s | %20s | %20s | %12s | %12s | %n", "Employee#", "Name", "Email", "Phone", "Salary");
        Store.printLine();
        for (int i = 0; i < this.employees.length; i++) {
            this.employees[i].printEmployee();
        }
    }

    /* prints a line using "=" */
    public static void printLine() {
        String line = "=";
        for (int i = 0; i < k ; i++) {
            line += "=";
        }
        System.out.println(line);
    }

    /* prints the title of the output
    gets store name as param used in formatted print (prinf)
    printLine() is called in this method*/
    public static void printTitle(String storeName) {
        System.out.printf("%" + 2*k/3 + "s %n", storeName + " Store Management System");
    }
}
