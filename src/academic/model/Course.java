package academic.model;

/**
 * @author 12S24026 Griselda Hutahaean
 */
public class Course {

    private String code;
    private String name;
    private int credits;
    private String grade;

    // constructor
    public Course(String code, String name, int credits, String grade) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    // getter
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public String getGrade() {
        return grade;
    }
}
