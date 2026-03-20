package academic.driver;

import academic.model.Student;
import java.util.Scanner;

/**
 * @author 12S24026 Griselda Hutahaean
 */
public class Driver2 {

    public static void main(String[] _args) {

        Scanner input = new Scanner(System.in);

        Student[] students = new Student[100]; // array untuk menyimpan banyak student
        int index = 0;

        while (true) {
            String line = input.nextLine();

            // kondisi berhenti
            if (line.equals("---")) {
                break;
            }

            // pecah input berdasarkan #
            String[] parts = line.split("#");

            String nim = parts[0];
            String name = parts[1];
            int year = Integer.parseInt(parts[2]);
            String studyProgram = parts[3];

            // buat object dan simpan ke array
            students[index] = new Student(nim, name, year, studyProgram);
            index++;
        }

        // tampilkan semua data
        for (int i = 0; i < index; i++) {
            System.out.println(
                students[i].getNim() + "|" +
                students[i].getName() + "|" +
                students[i].getYear() + "|" +
                students[i].getStudyProgram()
            );
        }

        input.close();
    }
}
