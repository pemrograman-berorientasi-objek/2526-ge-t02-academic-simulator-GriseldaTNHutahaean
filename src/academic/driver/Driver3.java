package academic.driver;

import academic.model.Enrollment;
import java.util.Scanner;

/**
 * @author 12S24026 Griselda Hutahaean
 */
public class Driver3 {

    public static void main(String[] _args) {

        Scanner input = new Scanner(System.in);

        Enrollment[] enrollments = new Enrollment[100];
        int index = 0;

        while (true) {
            String line = input.nextLine();

            // stop condition
            if (line.equals("---")) {
                break;
            }

            // split input
            String[] parts = line.split("#");

            String courseCode = parts[0];
            String studentNim = parts[1];
            String academicYear = parts[2];
            String semester = parts[3];

            // buat object (grade default = None di class)
            enrollments[index] = new Enrollment(
                courseCode, studentNim, academicYear, semester
            );
            index++;
        }

        // output
        for (int i = 0; i < index; i++) {
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
