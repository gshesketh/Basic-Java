public class ParttimeStudent extends Student {
    
    private double courseFeesTotal;
    private double credits;

    /* Parameterized constructor */
    ParttimeStudent(String first, String last, String email, long phone, int stdnum, String progName, double gpa, double total, double cred) {
        super(first, last, email, phone, stdnum, progName, gpa);
        this.courseFeesTotal = total;
        this.credits = cred;
    }

    /* calls superclass method to read student info
    then reads for the course fees and credit hours */
    public void readInfo() {
        super.readInfo();
    }

    /* calls superclass method to print student info
    then adds the course fees and credit hours  */
    public void printInfo() {
        super.printInfo();
    }

}
