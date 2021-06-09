public class Contractor extends Employee {
    private double hourlyRate;
    private double numHours;

    Contractor(String first, String last, String email,
    long phone, int empNum, double rate, double hours) {
        super(first, last, email, phone, empNum);
        this.hourlyRate = rate;
        this.numHours = hours;
    }

    /* call readEmployee from Employee parent then
     read rate and hours worked */
    @Override
    public void readEmployee() {
        super.readEmployee();
    }

    /* call printEmployee from Employee parent then 
    print rate and hours in formatted output (printf) */
    @Override
    public void printEmployee() {
        super.printEmployee();
    }
}
