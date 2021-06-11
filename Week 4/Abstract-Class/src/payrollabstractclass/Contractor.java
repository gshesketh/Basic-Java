package payrollabstractclass;
public class Contractor extends Employee {

    /* Default constructor */
    Contractor() {

    }

    /* Constructor with standard hourly and tax rate */
    Contractor(String first, String last, String email, double num) {
        super(first, last, email, num);
        super.hourlyRate = 45.0;
        super.taxRate = 0.15;
    } 

    /* Calculate payment amount using provided values and formula */
    public double calcPayroll() {
        return super.numHours * super.hourlyRate * (1 - super.taxRate);
    }

    /* Print the payment method line in the console */
    public void printPaymentMethod() {
        System.out.printf("Mailed a cheque to %s for $%f.2", super.getName(), calcPayroll());
    }
}
