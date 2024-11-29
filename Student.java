public class Student {
    private String name;
    private int rollNumber;
    private String grade;
    private String email;
    private int age;

    // Constructor: Initializes a new Student object with all the data
    public Student(String name, int rollNumber, String grade, String email, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.email = email;
        this.age = age;
    }

    // Getters and setters for each attribute to read and change their values
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // This method gives a string representation of the student object
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", grade='" + grade + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
