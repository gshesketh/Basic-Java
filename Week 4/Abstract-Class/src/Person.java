public class Person {
    protected String firstName;
    protected String lastName;
    protected String email;

    Person(String first, String last, String email) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}
