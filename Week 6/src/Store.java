public class Store {

    private Computer[] computers;

    // parameterized constructor that accepts a size and create an array of computers with that size
    Store(int size) {
        this.computers = new Computer[size];
    }

    // createComputers() method that create each computer.... 2 desktops and 2 laptops
    public void createComputers() {
        // Create Desktop - company: HP, price: 1199, OS: Windows8, headphone company: Beats
        this.computers[0] = new Desktop("HP", "Windows 8", 1199.0, "Beats");
        // Create Laptop - company: Asus, price: 1200, OS: Windows8, color: Blue      
        this.computers[1] = new Laptop("Asus", "Windows 8", "Blue", 1200.0);
        // Create Desktop - company: Acer, price: 950, OS: Windows10, headphone company: Jabra
        this.computers[2] = new Desktop("Acer", "Windows 10", 950.0, "Jabra");
        // Create Laptop - company: Apple, price: 1350, OS: MacOS, color: Silver
        this.computers[3] = new Laptop("Apple", "MacOS", "Silver", 1350.0);
     }

    // processDetails() uses a for loop to iterate through each computer, calculate and prints the details with the final price.
    public void processDetails() {
        for (int i = 0; i < this.computers.length; i++) {
            this.computers[i].printDetails();
        }
    }
}
