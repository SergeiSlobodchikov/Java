package Seminar5.HomeWork;

import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void addNumber(String surname, String number) {
        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(number);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(surname, numbers);
        }
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            List<String> numbers = entry.getValue();
            for (String number : numbers) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }

    public void menu() {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню\n1) Добавление номера\n2) Вывод всего\n0) Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Введите фамилию:");
                String surname = scanner.nextLine();
                System.out.println("Введите номер:");
                String number = scanner.nextLine();
                phoneBook.addNumber(surname, number);
            } else if (choice == 2) {
                phoneBook.printAll();

            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Неверный выбор");
            }
        }
        scanner.close();
    }
}