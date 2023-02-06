import java.util.ArrayList;

public class ExerciceTwo {

    public static void main(String[] args) {

        Course course = new Course("CYBERSECURITY PL78");

        Student student1 = new Student("KOUASSI KOUAKOU YVES",14, 4.5);
        Student student2 = new Student("JAMES LAWSON", 19, 5.8);
        Student student3 = new Student("PATRICK MAYSI", 20, 4.7);

        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);

        System.out.println("STudents list");
        course.printStudents();

        course.removeStudent(student3);

        System.out.println("Students list after delete student3:");
        course.printStudents();

    }

    public static class Course {
        private final ArrayList<Student> students;

        public Course(String name) {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void removeStudent(Student student) {
            students.remove(student);
        }

        public void printStudents() {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }

    }

    public static class Student {
        private String name;
        private int age;
        private double GPA;

        public Student(String name, int age, double GPA) {
            this.name = name;
            this.age = age;
            this.GPA = GPA;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getGPA() {
            return GPA;
        }

        public void setGPA(double GPA) {
            this.GPA = GPA;
        }
    }
}

