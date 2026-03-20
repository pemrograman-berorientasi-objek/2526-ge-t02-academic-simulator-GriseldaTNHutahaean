package academic.model;

/**
 * @author 12S24026 Griselda Hutahaean
 */
public class Enrollment {

    private String courseCode;
    private String studentNim;
    private String academicYear;
    private String semester;
    private String grade;

    // constructor (TANPA input grade)
    public Enrollment(String courseCode, String studentNim, String academicYear, String semester) {
        this.courseCode = courseCode;
        this.studentNim = studentNim;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = "None"; // default sesuai soal
    }

    // getter
    public String getCourseCode() {
        return courseCode;
    }

    public String getStudentNim() {
        return studentNim;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public String getGrade() {
        return grade;
    }
}
