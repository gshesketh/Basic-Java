public class Person {
    /* Protected specifier used to allow access for subclasses */
    protected String firstName;
    protected String lastName;
    protected String email;
    protected long phoneNumber;

    /* Constructeur */
    Person(String first, String last, String email, long phone) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
        this.phoneNumber = phone;
    }

    Person() {

    }
    
    /* Méthode qui donne le nom complet  */
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}
