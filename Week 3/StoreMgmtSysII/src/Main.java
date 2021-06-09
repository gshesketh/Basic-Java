public class Main {
    /* Read: store name and number of employees num
    store object created with num
    call readEmployeeDetails
    print title and header row
    call printEmployeeDetails to print details of all employees  */
    public static void main(String[] args) {
        Employee p1 = new Employee("John", "Doe", "doe@test.com", 123123123, 120);
        System.out.println(p1.getName()); 
    } 
    
}
