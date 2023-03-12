package Seminar4.HomeWork;

import java.util.LinkedList;
import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        calculator();
    }

    //Калькулятор
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> history = new LinkedList<Integer>();
        char operator = ' ';
        int number1 = 0;
        int number2 = 0;
        while (true) {
            System.out.println("Введите выражение для подсчета, пример (2 + 2) с пробелами, или 'отмена', или 'off':");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("off")) {
                break; // завершаем работу калькулятора
            } else if (input.equalsIgnoreCase("отмена")) {
                if (history.isEmpty()) {
                    System.out.println("История операций пуста!");
                } else {
                    history.pop(); // удаляем последний результат из истории
                    if (history.isEmpty()) {
                        System.out.println("История операций пуста!");
                    } else {
                        System.out.println("Отмена последней операции. Результат: " + history.peek());
                    }
                }
            } else {
                String[] numbers = input.split(" ");
                if (numbers.length > 3) {
                    System.out.println("Неверное количество слагаемых!");
                } else if (numbers.length == 2) {
                    try {
                        number1 = history.peek();
                        number2 = Integer.parseInt(numbers[1]);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат чисел!");
                        continue; // переходим к следующей итерации цикла
                    }
                    operator = numbers[0].charAt(0);
                } else if (numbers.length == 3) {
                    try {
                        number1 = Integer.parseInt(numbers[0]);
                        number2 = Integer.parseInt(numbers[2]);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат чисел!");
                        continue; // переходим к следующей итерации цикла
                    }
                    operator = numbers[1].charAt(0);
                }

                if (operator == '/' && number2 == 0) {
                    System.out.println("Делить на НОЛЬ НЕЛЬЗЯ, подучи математику");
                } else {
                    int result = 0;
                    switch (operator) {
                        case '+':
                            result = number1 + number2;
                            break;
                        case '-':
                            result = number1 - number2;
                            break;
                        case '*':
                            result = number1 * number2;
                            break;
                        case '/':
                            result = number1 / number2;
                            break;
                        default:
                            System.out.println("Неверный оператор!");
                            continue; // переходим к следующей итерации цикла
                    }
                    history.push(result); // добавляем результат в историю
                    System.out.println(result);
                }
            }
        }
        scanner.close();
    }
}
