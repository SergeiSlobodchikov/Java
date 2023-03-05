package Seminar2;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Three {
    private static final Logger LOGGER = Logger.getLogger(Three.class.getName());

    public static void main(String[] args) {
        log();
        calculator();
    }

    public static void log() {
        try {
            // настраиваем логгер
            FileHandler fileHandler = new FileHandler("src/Seminar2/calc.log", true);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            System.out.println("Не удалось настроить логгер");
        }

        // выводим все предыдущие результаты из лог-файла
        boolean hasResults = false;
        try {
            Scanner scanner = new Scanner(new java.io.File("src/Seminar2/calc.log"));
            while (scanner.hasNextLine()) {
                String result = scanner.nextLine();
                hasResults = true;
                System.out.println(result);
            }
            scanner.close();
            if (!hasResults) {
                System.out.println("Нет предыдущих результатов.");
            } else {
                System.out.println("Вывод результатов завершен.");
            }
        } catch (IOException e) {
            System.out.println("Не удалось прочитать лог-файл");
        }
    }

    //Калькулятор
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение для подсчета, пример (2 + 2) с пробелами:");
        String expression = scanner.nextLine();
        String[] numbers = expression.split(" ");
        if (numbers.length == 3) {
            int number1 = 0;
            int number2 = 0;
            try {
                number1 = Integer.parseInt(numbers[0]);
                number2 = Integer.parseInt(numbers[2]);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат чисел!");
            }
            char operator = numbers[1].charAt(0);
            if (operator == '/' && number2 == 0) {
                System.out.println("Делить на НОЛЬ НЕЛЬЗЯ, подучи математику");
                LOGGER.log(Level.INFO, "Делить на НОЛЬ НЕЛЬЗЯ, подучи математику");
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
                        break;
                }
                LOGGER.log(Level.INFO, expression + " = " + result); // записываем результат в лог-файл
                System.out.println(result);
            }
        } else {
            System.out.println("Неверное количество слагаемых!");
        }
        scanner.close();
    }
}