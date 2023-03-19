package Seminar6.HomeWork;

import java.util.*;

public class FilterNoteBook {
    public static Set<NoteBook> filterByBrand(Set<NoteBook> notebooks, String brand) {
        switch (brand) {
            case "1" -> {
                System.out.println("Вы выбрали ноутбук от HP");
                brand = "HP";
            }
            case "2" -> {
                System.out.println("Вы выбрали ноутбук от Dell");
                brand = "Dell";
            }
            case "3" -> {
                System.out.println("Вы выбрали ноутбук от Lenovo");
                brand = "Lenovo";
            }
            case "4" -> {
                System.out.println("Вы выбрали ноутбук от Apple");
                brand = "Apple";
            }
            case "5" -> {
                System.out.println("Вы выбрали ноутбук от Asus");
                brand = "Asus";
            }
            case "6" -> {
                System.out.println("Вы выбрали ноутбук от Acer");
                brand = "Acer";
            }
            case "7" -> {
                System.out.println("Вы выбрали ноутбук от Xiaomi");
                brand = "Xiaomi";
            }
            case "8" -> {
                System.out.println("Вы выбрали ноутбук от MSI");
                brand = "MSI";
            }
            case "9" -> {
                System.out.println("Вы выбрали ноутбук от Samsung");
                brand = "Samsung";
            }
            default -> {
                System.out.println("Вы выбрали ноутбук от неизвестного производителя");
                brand = "stop";
            }


        }
        if (!brand.equals("stop")) {
            Set<NoteBook> filtered = new HashSet<>();
            for (NoteBook notebook : notebooks) {
                if (notebook.getBrand().equals(brand)) {
                    filtered.add(notebook);
                }
            }
            return filtered;
        }
        return notebooks;
    }

    public static Set<NoteBook> filterByRam(Set<NoteBook> notebooks, int minRam, int maxRam) {
        Set<NoteBook> filtered = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if (notebook.getRam() >= minRam && notebook.getRam() <= maxRam) {
                filtered.add(notebook);
            }
        }
        System.out.printf("минимальный объем оперативной памяти %s и максимальный %s установлен\n", minRam, maxRam);
        return filtered;
    }

    public static Set<NoteBook> filterByStorage(Set<NoteBook> notebooks, int minStorage, int maxStorage) {
        Set<NoteBook> filtered = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if (notebook.getStorage() >= minStorage && notebook.getStorage() <= maxStorage) {
                filtered.add(notebook);
            }
        }
        System.out.printf("минимальный объем жесткого диска %s и максимальный %s установлен\n", minStorage, maxStorage);
        return filtered;
    }

    public static Set<NoteBook> filterByOs(Set<NoteBook> notebooks, String os) {
        switch (os) {
            case "1" -> {
                System.out.println("Windows 10");
                os = "Windows 10";
            }
            case "2" -> {
                System.out.println("MacOS");
                os = "MacOS";
            }
            case "3" -> {
                System.out.println("Ubuntu");
                os = "Ubuntu";
            }
            case "4" -> {
                System.out.println("Chrome OS");
                os = "Chrome OS";
            }
            case "5" -> {
                System.out.println("Bios");
                os = "Bios";
            }
            case "6" -> {
                System.out.println("Windows 11");
                os = "Windows 11";
            }
            default -> {
                System.out.println("Нету заданной операционной системы");
                os = "stop";
            }
        }
        if (!os.equals("stop")) {
            Set<NoteBook> filtered = new HashSet<>();
            for (NoteBook notebook : notebooks) {
                if (notebook.getOs().equals(os)) {
                    filtered.add(notebook);
                }
            }
            return filtered;
        }
        return notebooks;
    }

    public static Set<NoteBook> filterByColor(Set<NoteBook> notebooks, String color) {
        switch (color) {
            case "1" -> {
                System.out.println("Вы выбрали Black");
                color = "Black";
            }
            case "2" -> {
                System.out.println("Вы выбрали Silver");
                color = "Silver";
            }
            case "3" -> {
                System.out.println("Вы выбрали Gold");
                color = "Gold";
            }
            case "4" -> {
                System.out.println("Вы выбрали Rose Gold");
                color = "Rose Gold";
            }
            case "5" -> {
                System.out.println("Вы выбрали Space Gray");
                color = "Space Gray";
            }
            case "6" -> {
                System.out.println("Вы выбрали Cosmic black");
                color = "Cosmic black";
            }
            case "7" -> {
                System.out.println("Вы выбрали White");
                color = "White";
            }
            case "8" -> {
                System.out.println("Вы выбрали Blue");
                color = "Blue";
            }
            case "9" -> {
                System.out.println("Вы выбрали Green");
                color = "Green";
            }
            case "10" -> {
                System.out.println("Вы выбрали Yellow");
                color = "Yellow";
            }
            default -> {
                System.out.println("Вы выбрали неизвестный цвет");
                color = "stop";
            }
        }
        if (!color.equals("stop")) {
            Set<NoteBook> filtered = new HashSet<>();
            for (NoteBook notebook : notebooks) {
                if (notebook.getColor().equals(color)) {
                    filtered.add(notebook);
                }
            }
            return filtered;
        }
        return notebooks;
    }

    public static Set<NoteBook> filterByDiagonal(Set<NoteBook> notebooks, double minDiagonal, double maxDiagonal) {
        Set<NoteBook> filtered = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if (notebook.getDiagonal() >= minDiagonal && notebook.getDiagonal() <= maxDiagonal) {
                filtered.add(notebook);
            }
        }
        System.out.printf("минимальная диагональ экрана %s и максимальная диагональ экрана %s установлена\n", minDiagonal, maxDiagonal);
        return filtered;
    }

    public static Set<NoteBook> filterByPrice(Set<NoteBook> notebooks, double minPrice, double maxPrice) {
        Set<NoteBook> filtered = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if (notebook.getPrice() >= minPrice && notebook.getPrice() <= maxPrice) {
                filtered.add(notebook);
            }
        }
        System.out.printf("минимальная цена %s и максимальная %s установлена\n", minPrice, maxPrice);
        return filtered;
    }
}