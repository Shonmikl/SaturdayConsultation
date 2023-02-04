package saturday.patterns.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Person {
    String name;
    double salary;
    int age;
}