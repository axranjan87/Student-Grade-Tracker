import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeManager manager = new GradeManager();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter grade: ");
            int grade = sc.nextInt();
            sc.nextLine();

            manager.addStudent(name, grade);
        }

        manager.displayStudents();

        System.out.println("\nAverage Score: " + manager.getAverage());
        System.out.println("Highest Score: " + manager.getHighest());
        System.out.println("Lowest Score: " + manager.getLowest());

        sc.close();
    }
}