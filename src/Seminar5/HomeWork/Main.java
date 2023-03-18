package Seminar5.HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Меню\n1) Phone book\n2) Name counts\n3) EightsQueens\n0) Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                PhoneBook.menu();
                System.out.println();
            } else if (choice == 2) {
                String[] names = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                        "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                        "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                        "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
                NameCounts.nameCounts(names);
            } else if (choice == 3) {
                EightQueens.eightQueens();
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Неверный выбор");
            }
        }
        scanner.close();
    }
}
