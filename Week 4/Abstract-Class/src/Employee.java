public class Employee extends Person {
    protected double hourlyRate;
    protected double numHours;
    protected double taxRate;
    protected double deductionRate;

    Employee(String first, String last, String email)

    /* Method for calculating the payroll amount
    returns a doubl
    takes no param */
    public double calcPayroll() {
        double amount = 0.0;
        return amount;
    }

    /* Method for printing the method of payment */
    public void printPaymentMethod() {
        System.out.println("depositing amount to name's bank account.");
    }
}