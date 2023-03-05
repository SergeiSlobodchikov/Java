package Seminar2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Two {
    public static void main(String[] args) {
        correctionData();
    }
    public static void correctionData(){
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Seminar2/text_two.txt"))) {
            String line;
            // Делим строку на токены
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                String surname = null;
                String grade = null;
                String subject = null;
                //Ищем значения потому что кто то все переставил в txt
                for (String token : tokens) {
                    String[] parts = token.split(":");
                    String key = parts[0].replace("\"", "");
                    String value = parts[1].replace("\"", "");
                    if (key.equals("фамилия")) {
                        surname = value;
                    } else if (key.equals("оценка")) {
                        grade = value;
                    } else if (key.equals("предмет")) {
                        subject = value;
                    }
                }
                // формирования предложения
                StringBuilder builder = new StringBuilder();
                builder.append("Студент ")
                        .append(surname != null ? surname : "null")
                        .append(" получил ")
                        .append(grade != null ? grade : "null")
                        .append(" по предмету ")
                        .append(subject != null ? subject : "null")
                        .append(".");
                System.out.println(builder.toString());
            }
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");
        }
    }
}

