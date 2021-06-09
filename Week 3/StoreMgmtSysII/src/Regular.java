public class Regular extends Employee {
    private double salary;

    Regular(String first, String last, String email, long phone, int empNum,
    double sal) {
        super(first, last, email, phone, empNum);
        this.salary = sal;
    }

    /* Calls readEmployee from super class Employee then reads salary type
    and converts to monthly before storing it in salary instance var. */
    @Override
    public void readEmployee() {
        super.readEmployee();
        this.salary = 0.0;
    }

    /* Calls printEmployee from super Employee then prints the salary info
    using printf. */
    @Override
    public void printEmployee() {
        super.printEmployee();

    }
}
