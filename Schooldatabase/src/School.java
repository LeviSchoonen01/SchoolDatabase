//The Schools "profile"


import java.util.ArrayList;

    public class School {
        //array list for teachers and students
        ArrayList<Teacher> teachers = new ArrayList<>();

        ArrayList<Student> students = new ArrayList<>();

        //school name
        private String name;

        public School(String name) {
            this.name = name;
            this.teachers = new ArrayList<>();
            this.students = new ArrayList<>();
        }

        //used for adding teachers in Main class
        public void addTeacher(Teacher teacher) {
            teachers.add(teacher);
        }

        //adds students in main class
        public void addStudent(Student student) {
            students.add(student);
        }

        //Deletes Teachers
        public void deleteTeacher(Teacher teacher) {
            teachers.remove(teacher);
        }

        //deletes students
        public void deleteStudent(Student student) {
            students.remove(student);
        }

        //Displays all the teachers, used before I deleted them, and after, to display difference
        public void showAllTeachers() {
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }

        //same thing as showAllTeachers, but for the students
        public void showAllStudents() {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
