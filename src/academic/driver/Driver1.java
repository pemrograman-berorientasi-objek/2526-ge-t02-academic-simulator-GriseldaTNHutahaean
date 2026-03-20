package academic.driver;

import academic.model.Course;
import java.util.Scanner;

/**
 * @author 12S24026 Griselda Hutahaean
 */
public class Driver1 {

    public static void main(String[] _args) {

        Scanner input = new Scanner(System.in);

        Course[] courses = new Course[100]; // array untuk simpan banyak course
        int index = 0;

        while (true) {
            String line = input.nextLine();

            // kondisi berhenti
            if (line.equals("---")) {
                break;
            }

            // pecah input
            String[] parts = line.split("#");

            String code = parts[0];
            String name = parts[1];
            int credits = Integer.parseInt(parts[2]);
            String grade = parts[3];

            // buat object dan simpan
            courses[index] = new Course(code, name, credits, grade);
            index++;
        }

        // tampilkan output
        for (int i = 0; i < index; i++) {
            System.out.println(
                courses[i].getCode() + "|" +
                courses[i].getName() + "|" +
                courses[i].getCredits() + "|" +
                courses[i].getGrade()
            );
        }

        input.close();
    }
}
