package Seminar6.HomeWork;

import java.util.*;

public class Menu {
    public static void menu(Set<NoteBook> notebooks) {
        Scanner scanner = new Scanner(System.in);
        Set<NoteBook> startNotebooks = notebooks;

        String printMenu = "Введите цифру, соответствующую критерию фильтрации:\n" +
                "1 - по марке ноутбука\n" +
                "2 - по объему оперативной памяти\n" +
                "3 - по объему жесткого диска\n" +
                "4 - по операционной системе\n" +
                "5 - по цвету ноутбука\n" +
                "6 - по диагонали экрана\n" +
                "7 - по цене ноутбука\n" +
                "8 - Печать ноутбуков\n" +
                "9 - Сброс фильтра\n" +
                "0 - выход из фильтрации\n";

        System.out.println(printMenu);

        int filterCriteria = scanner.nextInt();

        while (filterCriteria != 0) {
            switch (filterCriteria) {
                case 1:
                    System.out.println("Марки:\n1) HP, \n2) Dell, \n3) Lenovo, \n4) Apple, \n5) Asus, \n6) Acer, \n7) Xiaomi, \n8) MSI, \n9) Samsung");
                    System.out.print("Введите марку ноутбука: ");
                    String brand = scanner.next();
                    notebooks = FilterNoteBook.filterByBrand(notebooks, brand);
                    System.out.println(printMenu);
                    break;
                case 2:
                    System.out.print("Введите минимальный объем оперативной памяти (в ГБ): ");
                    int minRam = scanner.nextInt();
                    System.out.print("Введите максимальный объем оперативной памяти (в ГБ): ");
                    int maxRam = scanner.nextInt();
                    notebooks = FilterNoteBook.filterByRam(notebooks, minRam, maxRam);
                    break;
                case 3:
                    System.out.print("Введите минимальный объем жесткого диска (в ГБ): ");
                    int minStorage = scanner.nextInt();
                    System.out.print("Введите максимальный объем жесткого диска (в ГБ): ");
                    int maxStorage = scanner.nextInt();
                    notebooks = FilterNoteBook.filterByStorage(notebooks, minStorage, maxStorage);
                    break;
                case 4:
                    System.out.println("OS: \n1) Windows 10, \n2) MacOS, \n3) Ubuntu, \n4) Chrome OS, \n5) Bios, \n6) Windows 11");
                    System.out.print("Введите операционную систему: ");
                    String os = scanner.next();
                    notebooks = FilterNoteBook.filterByOs(notebooks, os);
                    System.out.println(printMenu);
                    break;
                case 5:
                    System.out.print("Цвет: \n1) Black \n2) Silver \n3) Gold Rose \n4) Gold \n5) Space Gray \n6) Cosmic black \n7) White \n8) Blue \n9) Green \n10) Yellow");
                    System.out.print("Введите цвет ноутбука: ");
                    String color = scanner.next();
                    notebooks = FilterNoteBook.filterByColor(notebooks, color);
                    System.out.println(printMenu);
                    break;
                case 6:
                    System.out.print("Введите минимальную диагональ экрана (в дюймах): ");
                    double minDiagonal = scanner.nextDouble();
                    System.out.print("Введите максимальную диагональ экрана (в дюймах): ");
                    double maxDiagonal = scanner.nextDouble();
                    notebooks = FilterNoteBook.filterByDiagonal(notebooks, minDiagonal, maxDiagonal);
                    break;
                case 7:
                    System.out.print("Введите минимальную цену ноутбука (в рублях): ");
                    double minPrice = scanner.nextDouble();
                    System.out.print("Введите максимальную цену ноутбука (в рублях): ");
                    double maxPrice = scanner.nextDouble();
                    notebooks = FilterNoteBook.filterByPrice(notebooks, minPrice, maxPrice);
                    System.out.printf("минимальная цена %s и максимальная цена %s установлена", minPrice, maxPrice);
                    break;
                case 8:
                    List<NoteBook> sortedNotebooks = new ArrayList<>(notebooks);
                    Collections.sort(sortedNotebooks, Comparator.comparing(NoteBook::getPrice));
                    for (NoteBook notebook : sortedNotebooks) {
                        System.out.println(notebook);
                    }
                    System.out.println(printMenu);
                    break;
                case 9:
                    notebooks = startNotebooks;
                    System.out.println("Сбросили фильтры");
                    break;
                default:
                    System.out.println("Некорректный ввод. Попробуйте еще раз.");
                    break;
            }
            filterCriteria = scanner.nextInt();
        }
    }
}
