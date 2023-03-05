package Seminar2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class One {
    private static final Logger LOGGER = Logger.getLogger(One.class.getName());

    public static void main(String[] args) {
        log();
        bubbleSort(massive());
    }


    // настраиваем логгер
    public static void log() {
        try {

            FileHandler fileHandler = new FileHandler("src/Seminar2/sort.log", false);// будет перезаписывать
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            System.out.println("Не удалось настроить логгер");
        }
    }

    // Пишем с консоли массив
    public static int[] massive(){
        System.out.println("Введите длину массива\n");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        System.out.printf("Введите %d чисел массива через пробел:", num);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;

    }

    // массив сортировка пузырьком
    public static void bubbleSort(int[] massiv) {
        LOGGER.info("Начальный массив: " + Arrays.toString(massiv));
        boolean sorted = false;
        int temp;
        int iterations = 0;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < massiv.length - 1; i++) {
                if (massiv[i] > massiv[i+1]) {
                    temp = massiv[i];
                    massiv[i] = massiv[i+1];
                    massiv[i+1] = temp;
                    sorted = false;
                }
            }
            LOGGER.info("Итерация " + (++iterations) + ": " + Arrays.toString(massiv));
        }
        LOGGER.info("Отсортированный массив: " + Arrays.toString(massiv));
    }
}

