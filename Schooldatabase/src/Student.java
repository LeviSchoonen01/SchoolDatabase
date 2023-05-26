public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;
    private static int nextStudentNumber = 1;

    //for student profile creations
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = nextStudentNumber++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade + " Student Number: " + studentNumber;
    }
}
