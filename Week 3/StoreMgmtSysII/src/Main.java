import java.util.Scanner;

public class Main {
    /* Read: store name and number of employees num
    store object created with num
    call readEmployeeDetails
    print title and header row
    call printEmployeeDetails to print details of all employees  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the store: ");
        String storeName = sc.nextLine();
        System.out.println("How many employees do you have? ");
        int num = sc.nextInt();
        sc.nextLine();
        Store store = new Store(num);
        store.readEmployeeDetails();
        Store.printLine();
        Store.printTitle(storeName);
        Store.printLine();
        store.printEmployeeDetails();
    } 
}
