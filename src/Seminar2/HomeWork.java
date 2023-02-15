package Seminar2;

//import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(normalizeString("Добрый день             Как дела                   Все хорошо"));
//        System.out.println(normalizeString(scan()));
    }

//    public static String scan(){
//        Scanner sc = new Scanner(System.in);
//        String scanner = sc.nextLine();
//        sc.close();
//        return scanner;
//    }
    public static String normalizeString(String str) {
        String stroka = "Пустая строка!";
        if (str.length() > 0) {
            stroka = str.trim().replaceAll("\\s+", " ") + ".";
            for (int i = 0; i < stroka.length()-1; i++) {
                char c = stroka.charAt(i);
                if (Character.isUpperCase(c) && i > 0) {
                    StringBuilder strBuilder = new StringBuilder(stroka);
                    strBuilder.replace(i-1, i, ". ");
                    stroka = String.valueOf(strBuilder);
                    i++;
                }
            }
        }
        return stroka;
    }
}