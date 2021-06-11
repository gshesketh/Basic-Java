package payrollabstractclass;
public class Contractor extends Employee {

    /* Default constructor */
    Contractor() {

    }

    /* Constructor with standard hourly and tax rate */
    Contractor(String first, String last, String email, double numHours) {
        super(first, last, email, numHours);
        super.hourlyRate = 45.0;
        super.taxRate = 0.15;
    } 

    public double calcPayroll() {

    }

    public void printPaymentMethod() {

    }
}
