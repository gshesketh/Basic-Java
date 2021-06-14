public abstract class Person {
    
    protected String firstName;
    protected String lastName;
    protected String emailId;
    protected long phoneNumber;
    
    /* Default constructor */
    Person() {
    }

    /* Parameterized constructor */
    Person(String first, String last, String email, long phone) {
        this.firstName = first;
        this.lastName = last;
        this.emailId = email;
        this.phoneNumber = phone;
    }

    /* Abstract methods */
    public abstract void readInfo();

    public abstract void printInfo();

}