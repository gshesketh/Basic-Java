package payrollabstractclass;
public class Regular extends Employee {

    /* Default constructor */
    Regular() {

    }

    /* Constructor with standard hourly and deduction rate */
    Regular(String first, String last, String email, double num) {
        super(first, last, email, num);
        super.hourlyRate = 30.0;
        super.deductionRate = 0.17;
    }

    /* Calculate payment amount using provided values and formula */
    public double calcPayroll() {
        return super.numHours * super.hourlyRate * (1 - super.deductionRate);
    }

    /* Print the payment method line in the console */
    public void printPaymentMethod() {
        System.out.printf("Direct depositing $%f.2 to %s's bank account", calcPayroll(), super.getName());
    }

}
