package saturday.patterns.flyWeight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StudentUniversityInfo {
    String faculty;
    String university;
    Hostel address;
}

class Hostel {
}

class StudentPersonalInfo {
    String name;
    int age;
}