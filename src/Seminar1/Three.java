package Seminar1;//Реализовать простой калькулятор
import java.util.Scanner;
public class Three {
    //простой калькулятор
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
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
            if (operator == '/' && number2 == 0){
                System.out.println("Делить на НОЛЬ НЕЛЬЗЯ, подучи математику");
            } else switch (operator) {
                case '+' -> System.out.println(number1 + number2);
                case '-' -> System.out.println(number1 - number2);
                case '*' -> System.out.println(number1 * number2);
                case '/' -> System.out.println(number1 / number2);
                default -> System.out.println("Неверный оператор!");

            }
        }
        else{
            System.out.println("Неверное количество слагаемых!");
        }
    }
}