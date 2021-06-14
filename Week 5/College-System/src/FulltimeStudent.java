public class FulltimeStudent extends Student {

    private double tuitionFees;

    /* Parameterized constructor */
    FulltimeStudent(String first, String last, String email, long phone, int stdnum, String progName, double gpa, double fees) {
        super(first, last, email, phone, stdnum, progName, gpa);
        this.tuitionFees = fees;
    }

    /* Method to read fulltimestudent-specific info
    calls the superclass method then reads tuition fees */
    public void readInfo() {
        super.readInfo();
    }

    /* calls superclass method to print info then 
    adds the tuition fees field */
    public void printInfo() {
        super.printInfo();
    }
    
}
