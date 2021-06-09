public class Person {
    /* Protected specifier used to allow access for subclasses */
    protected String firstName;
    protected String lastName;
    protected String email;
    protected long phoneNumber;

    /* Constructeur
    Peut-être avoir besoin d'arguments plus tard. */
    Person(String first, String last, String email, long phone) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
        this.phoneNumber = phone;
    }
    /* Méthode qui donne le nom complet  */
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}
