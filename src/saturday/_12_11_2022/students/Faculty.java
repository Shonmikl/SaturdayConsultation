package saturday._12_11_2022.students;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studentsOnFaculty = new ArrayList<>();
    }

    public void addStOnF(Student s) {
        studentsOnFaculty.add(s);
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }
}