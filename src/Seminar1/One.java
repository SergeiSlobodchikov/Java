package Seminar1;//Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class One {
    // вводим число
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = -1;
        if (scanner.hasNextInt()) {
           n = scanner.nextInt();
        }
        if (n >= 0){
            // Вычисляем n-ое треугольное число
            int triangleNumber = 0;
            for (int i = 1; i <= n; i++) {
                triangleNumber += i;
            }
            System.out.println("n-ое треугольное число: " + triangleNumber);
            // Вычисляем n!
            int factorialN = 1;
            for (int i = 1; i <= n; i++) {
                factorialN *= i;
            }
            System.out.println("Факториал n: " + factorialN);
        }
        else {
            System.out.println("Вводить надо число n >= 0");
        }
    }
}