package Seminar6.HomeWork;

import java.util.Random;

public class NoteBook {
    private String brand; // Марка ноутбука
    private int ram; // Объем оперативной памяти (ГБ)
    private int storage; // Объем жесткого диска (ГБ)
    private String os; // Операционная система
    private String color; // Цвет ноутбука
    private double price; // Цена ноутбука

    private double diagonal;

    // Конструктор
    public NoteBook(String brand, int ram, int storage, String os, String color, double diagonal, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
        this.diagonal = diagonal;
        this.price = price;
    }


    public NoteBook() {
        Random rand = new Random();
        String[] brands = {"HP", "Dell", "Lenovo", "Apple", "Asus", "Acer", "Xiaomi", "MSI", "Samsung"};
        String[] osOptions = {"Windows 10", "Ubuntu", "Chrome OS", "Bios", "Windows 11"};
        String[] colors = {"Black", "Silver", "Gold", "Rose Gold", "Space Gray", "Cosmic black", "White", "Blue", "Green", "Yellow"};
        int[] ramBetween = {2, 3, 4, 6, 8, 12, 14, 16, 24, 32, 64};
        int[] storageBetween = {128, 256, 512, 1024, 2048};
        this.brand = brands[rand.nextInt(brands.length)];
        this.ram = ramBetween[rand.nextInt(ramBetween.length)]; // Ram between 4GB and 64GB
        this.storage = storageBetween[rand.nextInt(storageBetween.length)];// Storage between 128GB and 2TB
        String operationSystem;
        if (this.brand.equals("Apple")) {
            operationSystem = "MacOS";
        } else operationSystem = osOptions[rand.nextInt(osOptions.length)];
        this.os = operationSystem;
        this.color = colors[rand.nextInt(colors.length)];
        this.diagonal = rand.nextDouble() * 5 + 12; // Diagonal between 12" and 16"

        // Price calculation based on characteristics
        double price = 0;
        switch (this.brand) {
            case "Dell" -> price += 2000;
            case "Lenovo" -> price += 3200;
            case "Samsung" -> price += 4000;
            case "Apple", "MSI" -> price += 5000;
            case "Asus", "HP" -> price += 3500;
            case "Acer", "Xiaomi" -> price += 3000;
        }

        if (this.os.equals("Windows 10") || this.os.equals("Windows 11")) {
            price += 11000;
        } else if (this.os.equals("MacOS")) {
            price += 13000;
        } else {
            price += 7000;
        }

        price += this.ram * 2000;
        price += this.storage * 4;
        price += this.diagonal * 1000;

        switch (this.color) {
            case "Rose Gold", "Space Gray", "Cosmic black" -> price += 5000;
            case "Gold" -> price += 3000;
            case "Blue", "Green", "Yellow" -> price += 2000;
        }
        this.price = price;
    }


    // Геттеры
    public String getBrand() {
        return brand;
    }

    public double getDiagonal() {
        return diagonal;
    }


    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    // Сеттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    // Переопределенный метод toString для удобства вывода информации о ноутбуке
    @Override
    public String toString() {
        return "NoteBook{" +
                "brand ='" + brand + '\'' +
                ", ram = " + ram +
                ", storage = " + storage +
                ", OS = '" + os + '\'' +
                ", color = '" + color + '\'' +
                ", diagonal = " + String.format("%.2f", diagonal) +
                ", price = " + String.format("%.2f", price) +
                '}';
    }
}

