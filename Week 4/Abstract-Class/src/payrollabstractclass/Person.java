package payrollabstractclass;
public class Person {
    protected String firstName;
    protected String lastName;
    protected String email;

    /* Default constructor */
    Person() {

    }
    
    /* Constructor for basic info */
    Person(String first, String last, String email) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
    }

    /* get full name of person */
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}
