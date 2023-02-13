package Seminar1;

import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение пример (2? + ? = 29) и мы покажем варианты решений,");
        System.out.println("Пока работает только с суммой двух слагаемых и на каждое слагаемое не более одного знака ? при записи пробелы также важны: ");
        String expression = scanner.nextLine();
        String[] numbers = expression.split(" ");
        if (numbers.length == 5) {
            int x1 = num(numbers,0);
            int x2 = num(numbers,2);
            int answer = 0;
            // оба имеют ?
            if (x1 >= 0 && x2 >= 0){
                String[] q = numbers[0].split("");
                String[] w = numbers[2].split("");
                for (int i = 0; i < 10 ; i++) {
                    q[x1] = String.valueOf(i);
                    for (int j = 0; j < 10 ; j++) {
                        w[x2] = String.valueOf(j);
                        int resultq = getResult(q,i);
                        int resultw = getResult(w,j);
                        if (resultq + resultw == Integer.parseInt(numbers[4])){
                            System.out.println("Решение: "+ resultq + " + " + resultw + " = " + Integer.parseInt(numbers[4]));
                            answer = 1;
                        }
                        else if (i == 9 && j == 9 && answer == 0 ) {
                            System.out.println("Нету решений");
                        }
                    }
                }
            }
            // первое число имеет ?
            else if (x1 >= 0 && x2 == -1){
                String[] q = numbers[0].split("");
                for (int i = 0; i < 10 ; i++) {
                    q[x1] = String.valueOf(i);
                    int resultq = getResult(q,i);
                    if (resultq + Integer.parseInt(numbers[2]) == Integer.parseInt(numbers[4])){
                        System.out.println("Решение: "+ resultq + " + " + Integer.parseInt(numbers[2]) + " = " + Integer.parseInt(numbers[4]));
                        answer = 1;
                    }
                    else if (i == 9 && answer == 0) {
                        System.out.println("Нету решений");
                    }
                }
            }
            // второе число имеет ?
            else if (x2 >= 0 && x1 == -1) {
                String[] w = numbers[2].split("");
                for (int i = 0; i < 10; i++) {
                    w[x2] = String.valueOf(i);
                    int resultw = getResult(w,i);
                    if (resultw + Integer.parseInt(numbers[0]) == Integer.parseInt(numbers[4])) {
                        System.out.println("Решение: " + Integer.parseInt(numbers[2]) + " + " + resultw + " = " + Integer.parseInt(numbers[4]));
                        answer = 1;
                    }
                    else if (i == 9 && answer == 0) {
                        System.out.println("Нету решений");
                    }
                }
            }
            // числа не имеют ?
            else {
                if (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[2]) == Integer.parseInt(numbers[4])) {
                    System.out.println("Решение: " + Integer.parseInt(numbers[0]) + " + " + Integer.parseInt(numbers[2]) + " = " + Integer.parseInt(numbers[4]));
                } else {
                    System.out.println("Нету решений");
                }
            }
        }
        else {
            System.out.println("Вы ввели не правильный пример");
        }
    }

    // длина числа с ?
    private static int getResult(String[] q, int i) {
        int result = 0;
        if (2 == q.length) {
            result = Integer.parseInt(q[0] + q[1]);
        } else if (2 < q.length) {
            for (String s : q) result = result * 10 + Integer.parseInt(s);
        } else {
            result = i;
        }
        return result;
    }


    private static int num(String[] numbers, int z) {
        int x = -1;
        if (numbers[z].contains("?")) {
            String[] letters = numbers[z].split("");
            for (int i = 0; i < numbers[z].length(); i++) {
                if ("?".equals(letters[i])) {
                    letters[i] = String.valueOf(0);
                    x = i;
                }
            }
        }
        return x;
    }
}
