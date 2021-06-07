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

        readSalary();
    }

    public void readSalary() {

    }

    public void printEmployee() {

    }
}
