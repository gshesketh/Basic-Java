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

    public double calcPayroll() {

    }

    public void printPaymentMethod() {
        
    }

}
