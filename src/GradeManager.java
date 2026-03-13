import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int grade) {
        students.add(new Student(name, grade));
    }

    public double getAverage() {
        int sum = 0;

        for (Student s : students) {
            sum += s.getGrade();
        }

        return (double) sum / students.size();
    }

    public int getHighest() {
        int highest = students.get(0).getGrade();

        for (Student s : students) {
            if (s.getGrade() > highest) {
                highest = s.getGrade();
            }
        }

        return highest;
    }

    public int getLowest() {
        int lowest = students.get(0).getGrade();

        for (Student s : students) {
            if (s.getGrade() < lowest) {
                lowest = s.getGrade();
            }
        }

        return lowest;
    }

    public void displayStudents() {

        System.out.println("\nStudent List:");

        for (Student s : students) {
            System.out.println(s.getName() + " : " + s.getGrade());
        }
    }
}