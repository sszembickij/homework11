/*В текстовый файл построчно записаны фамилия и имя учащихся
класса и его оценка.
a) Вывести средний балл по классу.
b) Записать в другой файл всех чья оценка меньше 3 баллов.*/

package Students;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String fileNameFromRead = "students.txt";
        String fileNameFromWrite = "studentsFromDeduction.txt";
        StringBuilder result = new StringBuilder();
        int count = 0;
        int temp = 0;
        int appraisal;

        try (BufferedReader br = new BufferedReader(new FileReader(fileNameFromRead))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                appraisal = Integer.parseInt(currentLine.substring(currentLine.length() - 1));
                if (appraisal < 3) {
                    result.append(currentLine).append("\n");
                }
                count++;
                temp += appraisal;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.printf("Средний балл по классу - %.2f", (double) temp / count);

        writeToFile(result.toString(), fileNameFromWrite);
    }

    private static void writeToFile(String str, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}