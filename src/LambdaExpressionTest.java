import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionTest {
    public static void main(String[] args) {
        Student s1 = new Student("Suraj", "ktm", 16);
        Student s2 = new Student("Hari", "chtqn", 12);
        Student s3 = new Student("Ram", "ntharatpur", 21);
        Student s4 = new Student("Shiva", "ktm", 20);
        Student s5 = new Student("Topa", "ktm", 19);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

//        for (Student student : students) {
//            System.out.println(student.getName());
//        }

//        students.forEach(s -> System.out.println(s.getName()));
        students.forEach(s -> System.out.println(s.getName()));

        students.stream().filter(student -> student.getName().equalsIgnoreCase("Ram")).findAny().orElse(null);

//        Student checkStudent = findStudentinList(students, "Ram");
//        System.out.println(checkStudent.getLocation());

    }

    public static Student findStudentinList(List<Student> students, String nametoFind) {
        //check if the list of students contains student whose name is Ram
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(nametoFind)) {
                return student;
            }
        }
        return null;
    }
}

