public class Employee extends Person {
    protected int employeeNumber;

    /* Constructeur qui initialise un employé qui est aussi un objet Person */
    Employee(String first, String last, String email, long phone, int empNum) {
        super(first, last, email, phone);
        this.employeeNumber = empNum;
    }

    /* Lit l'information de l'employé */
    public void readEmployee() {

    }

    /* Imprime l'information de manière formattée à l'aide de printf */
    public void printEmployee() {

    }
}
