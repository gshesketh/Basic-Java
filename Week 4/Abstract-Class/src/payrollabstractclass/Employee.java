package payrollabstractclass;

public abstract class Employee extends Person {
    protected double numHours;
    protected double hourlyRate;
    protected double taxRate;
    protected double deductionRate;

    Employee() {

    }

    Employee(String first, String last, String email, double num) {
        super(first, last, email);
        this.numHours = num;
    }

    /* abstract Method for calculating the payroll amount
    returns a doubl
    takes no param */
    public abstract double calcPayroll();

    /* abstract Method for printing the method of payment */
    public abstract void printPaymentMethod();
}