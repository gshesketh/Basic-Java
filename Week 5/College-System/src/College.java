import java.util.Scanner;

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
        System.out.printf("%n%s%n%s%n", title, verticalLine);
    }

    /* Loop through students and read appropriate data by assigning the correct object and calling the associated readInfo() method */
    public void readStudentsDetails() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.students.length; i++) {
            int std = i + 1;
            System.out.println("Enter details of student " + std);
            System.out.println("=============================");
            System.out.println("1 - Fulltime Student");
            System.out.println("2 - Parttime Student");
            System.out.println("Select and enter student type: ");
            int type = sc.nextInt();
            if (type == 1) { /* fulltime student */
                students[i] = new FulltimeStudent();
            }
            else if (type == 2) { /* parttime student */
                students[i] = new ParttimeStudent();
            }
            else { /* any other integer selection */
                System.out.println("Wrong student type selected.");
            }
            students[i].readInfo();
            students[i].readMarks();
        }
    }

    /* call printTitle() and create header row before looping through students to printInfo(); */
    public void printStudentsDetails() {
        System.out.printf("%10s|%8s|%15s|%15s|%15s|%5s|%10s|%7s|%n", "Program", "Student#", "Name", "Email", "Phone#", "GPA", "Fees", "Credits");
        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
        }
    }
    
}
