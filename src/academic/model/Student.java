package academic.model;

/**
 * @author 12S24026 Griselda Hutahaean
 */
public class Student {

    private String nim;
    private String name;
    private int year;
    private String studyProgram;

    // constructor
    public Student(String nim, String name, int year, String studyProgram) {
        this.nim = nim;
        this.name = name;
        this.year = year;
        this.studyProgram = studyProgram;
    }

    // getter
    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getStudyProgram() {
        return studyProgram;
    }
}
