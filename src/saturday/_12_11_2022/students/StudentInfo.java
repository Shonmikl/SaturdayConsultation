package saturday._12_11_2022.students;

import java.util.ArrayList;

public class StudentInfo {
    void testStudent(ArrayList<Student> al, StudentCheck sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sergey", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nik", 'm', 28, 2, 7.4);
        Student s3 = new Student("Elena", 'w', 32, 1, 9.0);
        Student s4 = new Student("Petr", 'm', 30, 4, 6.0);
        Student s5 = new Student("Marya", 'w', 25, 5, 7.7);

        ArrayList<Student> student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);

        StudentInfo info = new StudentInfo();
        info.testStudent(student, s -> s.getAvgGrade() > 8);
    }
}

@FunctionalInterface
interface StudentCheck {
    boolean check(Student s);
}

class CheckOverGrade implements StudentCheck {
    @Override
    public boolean check(Student s) {
        return s.getAvgGrade() > 8;
    }
}