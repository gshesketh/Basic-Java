public class College {
    
    private String name;
    private Student[] students;

    College(String name, int n) {
        this.name = name;
        this.students = new Student[n];
    }

    /* Print title of the college */
    public void printTitle() {
        String verticalLine = "*";
        String title = this.name + " - List of Students";
        int k = title.length();
        for (int i = 1; i < k; i++) {
            verticalLine += "*";
        }
        System.out.printf("%s%n%s%n", title, verticalLine);
    }

    /* Loop through students and read appropriate data by assigning the correct object and calling the associated readInfo() method */
    public void readStudentsDetails() {

    }

    /* call printTitle() and create header row before looping through students to printInfo(); */
    public void printStudentsDetails() {
        System.out.printf("%10s|%8s|%15s|%15s|%15s|%5s|%10s|%5s|%n", "Program", "Student#", "Name", "Email", "Phone#", "GPA", "Fees", "Credits");
    }
    
}
