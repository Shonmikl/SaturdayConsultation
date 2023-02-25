package saturday.patterns.flyWeight;

import java.util.WeakHashMap;

public class StudentCache {
    private static final WeakHashMap<String, StudentUniversityInfo> studentUniversityInfos
            = new WeakHashMap<>();

    public StudentUniversityInfo getStudentUniversityInfos(String name) {
        StudentUniversityInfo studentUniversityInfo = studentUniversityInfos.get(name);
        if(studentUniversityInfo == null) {
            studentUniversityInfo = createStudentInfo(name);
            studentUniversityInfos.put(name, studentUniversityInfo);
        }
        return studentUniversityInfo;
    }

    private StudentUniversityInfo createStudentInfo(String faculty) {
        return switch (faculty) {
            case "IT" -> new StudentUniversityInfo(faculty, "NY", new Hostel());
            case "FINANCE" -> new StudentUniversityInfo(faculty, "LA", new Hostel());
            case "HR" -> new StudentUniversityInfo(faculty, "BARSELONA", new Hostel());
            default -> new StudentUniversityInfo(faculty, "TEST", new Hostel());
        };
    }

    public static void main(String[] args) {
        StudentCache cache = new StudentCache();
        StudentUniversityInfo s = cache.getStudentUniversityInfos("IT");
        StudentUniversityInfo s1 = cache.getStudentUniversityInfos("IT");

        System.out.println(s == s1);
    }
}