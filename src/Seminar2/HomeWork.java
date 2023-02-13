package Seminar2;

//import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(normalizeString("Добрый день             Как дела                   Все хорошо"));
//        System.out.println(normalizeString(scan()));
    }

//        public static String scan(){
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
    public static String normalizeString(String str) {
        String stroka = "Пустая строка!";
        if (str.length() > 0) {
            stroka = str.trim().replaceAll("\\s+", " ") + ".";
            for (int i = 0; i < stroka.length(); i++) {
                char c = stroka.charAt(i);
                if (Character.isUpperCase(c) && i > 0) {
                    String zagl = ". " + c;
                    stroka = stroka.replaceAll(String.valueOf(c), zagl);
                    i += 2;
                }
            }
            stroka = stroka.replaceAll(" . ", ". ");
        }
        return stroka;
    }
}
