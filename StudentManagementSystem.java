import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem{

    private List<Student> students = new ArrayList<>(); // A list to store students

    // Method to add a student to the list
    public void addStudent(String name, int rollNumber, String grade, String email, int age) {
        Student student = new Student(name, rollNumber, grade, email, age);
        students.add(student); // Adds the student to the list
    }

    // Method to remove a student by roll number
    public boolean removeStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student); // Removes the student from the list
                return true;
            }
        }
        return false; // Returns false if student not found
    }

    // Method to search for a student by roll number
    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student; // Returns the student object
            }
        }
        return null; // If not found, returns null
    }

    // Method to display all students in the list
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            System.out.println(student); // Prints each student's details
        }
    }
}

