package saturday._12112022.students;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
}