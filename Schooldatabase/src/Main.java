import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //School name, School of Canada, because Canada is the best
        School school = new School("School Of Canada");

        //Teacher's "profiles"
        Teacher teacher1 = new Teacher("John", "Smith", "Math");
        Teacher teacher2 = new Teacher("Sara", "Green", "Science");
        Teacher teacher3 = new Teacher("Ben", "Kendricks", "Computers");

        //Student's "profiles"
        Student student1 = new Student("Billy", "Flynn", 12);
        Student student2 = new Student("Caleb", "Wolfe", 10);
        Student student3 = new Student("Griffin", "King", 9);
        Student student4 = new Student("Quinn", "Owens", 9);
        Student student5 = new Student("Tristan", "Decker", 11);
        Student student6 = new Student("Tom", "Fox", 8);
        Student student7 = new Student("Jack", "Mcdaniel", 9);
        Student student8 = new Student("Adam", "Navarro", 9);
        Student student9 = new Student("George", "Oconnell", 10);
        Student student10 = new Student("Dan", "Ritter", 8);

        //Adds teachers to the school
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        // Adds the students to the school database.
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.addStudent(student6);
        school.addStudent(student7);
        school.addStudent(student8);
        school.addStudent(student9);
        school.addStudent(student10);

        //Show's Teachers
        System.out.println("Teachers:");
        school.showAllTeachers();

        //Show's students.
        System.out.println('\n'+"Students:");
        school.showAllStudents();

        //Uses Delete from school class, on teacher 3
        school.deleteTeacher(teacher3);

        //uses delete stutend from school class, on student 5 and 6 (to demonstrate their student numbers)
        school.deleteStudent(student5);
        school.deleteStudent(student6);

        //displays teachers after delete
        System.out.println('\n'+"Teachers after delete:");
        school.showAllTeachers();

        //Display students after deleted
        System.out.println('\n'+"Students after delete:");
        school.showAllStudents();
    }
}

