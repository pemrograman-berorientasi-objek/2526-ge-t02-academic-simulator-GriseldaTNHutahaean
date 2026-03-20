package academic.driver;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.Scanner;

/**
 * @author 12S24026 Griselda Hutahaean
 */
public class Driver4 {

    public static void main(String[] _args) {

        Scanner input = new Scanner(System.in);

        Course[] courses = new Course[100];
        Student[] students = new Student[100];
        Enrollment[] enrollments = new Enrollment[100];

        int cIndex = 0;
        int sIndex = 0;
        int eIndex = 0;

        while (true) {
            String line = input.nextLine();

            if (line.equals("---")) {
                break;
            }

            String[] parts = line.split("#");

            if (parts[0].equals("course-add")) {
                courses[cIndex] = new Course(
                    parts[1],
                    parts[2],
                    Integer.parseInt(parts[3]),
                    parts[4]
                );
                cIndex++;
            } 
            else if (parts[0].equals("student-add")) {
                students[sIndex] = new Student(
                    parts[1],
                    parts[2],
                    Integer.parseInt(parts[3]),
                    parts[4]
                );
                sIndex++;
            } 
            else if (parts[0].equals("enrollment-add")) {
                enrollments[eIndex] = new Enrollment(
                    parts[1],
                    parts[2],
                    parts[3],
                    parts[4]
                );
                eIndex++;
            }
        }

        // OUTPUT

        // 1. Course
        for (int i = 0; i < cIndex; i++) {
            System.out.println(
                courses[i].getCode() + "|" +
                courses[i].getName() + "|" +
                courses[i].getCredits() + "|" +
                courses[i].getGrade()
            );
        }

        // 2. Student
        for (int i = 0; i < sIndex; i++) {
            System.out.println(
                students[i].getNim() + "|" +
                students[i].getName() + "|" +
                students[i].getYear() + "|" +
                students[i].getStudyProgram()
            );
        }

        // 3. Enrollment
        for (int i = 0; i < eIndex; i++) {
            System.out.println(
                enrollments[i].getCourseCode() + "|" +
                enrollments[i].getStudentNim() + "|" +
                enrollments[i].getAcademicYear() + "|" +
                enrollments[i].getSemester() + "|" +
                enrollments[i].getGrade()
            );
        }

        input.close();
    }
}
