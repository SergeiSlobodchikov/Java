package Seminar4;

import java.util.*;
import java.io.*;

public class PhoneDirectory {
    public static HashMap<String, HashSet> phoneMap;

    public static void main(String[] args) throws IOException {
        menuPhoneDirectory();
    }

    public static void menuPhoneDirectory() throws IOException {
        new PhoneDirectory();
        loadFromFile(new File("src/Seminar4/phone.txt"));
        Scanner sc = new Scanner(System.in);
        String znak = "0";
        String login = "";
        HashSet<String> phone = new HashSet<String>();
        while (!znak.equals("6")) {
            System.out.println("Menu \n1. Добавить новый контакт или телефон к уже существующему \n2. Удалить телефон"+
                    "\n3. Вывод телефона Контакта \n4. Показать все контакты \n5. Удалить контакт \n6. Выход \n");
            znak = sc.nextLine();
            switch (znak) {
                case ("1"):
                    System.out.println("Введите имя контакта");
                    login = sc.nextLine();
                    System.out.println("Введите телефон");
                    addPhone(login, sc.nextLine());
                    break;
                case ("2"):
                    System.out.println("Введите имя контакта");
                    login = sc.nextLine();
                    System.out.println("Введите телефон");
                    String phon1 = sc.nextLine();
                    deletePhone(login, phon1);
                    break;
                case ("3"):
                    System.out.println("Введите имя контакта");
                    System.out.println(getPhone(sc.nextLine()));
                    break;
                case ("4"):
                    getAllLogins();
                    break;
                case ("5"):
                    System.out.println("Введите логин который вы хотите удалить\n");
                    login = sc.nextLine();
                    System.out.printf("\nудалить %s Да 1, нет 0\n", login);
                    String yon = sc.nextLine();
                    if (Objects.equals(yon, "1")) {
                        phoneMap.remove(login);
                    } else {
                        System.out.println("Хорошо не будем удалять");
                    }
                    break;
                case ("6"):
                    System.out.println("До свидания");
                    znak = "6";
                    break;
                default:
                    System.out.println("Вы ввели не тот знак");
                    break;
            }
            System.out.println();
        }
        saveToFile(new File("src/Seminar4/phone.txt"));
        sc.close();
    }

    public PhoneDirectory() {
        phoneMap = new HashMap<>();
    }

    public static void addPhone(String login, String phone) {
        if (phoneMap.containsKey(login)) {
            phoneMap.get(login).add(phone);
        } else {
            HashSet<String> phon = new HashSet<>();
            Collections.addAll(phon, phone);
            phoneMap.put(login, phon);
        }
    }



    public static void deletePhone(String login, String phone) {
        if (phoneMap.containsKey(login)) {
            phoneMap.get(login).remove(phone);
        }
    }

    public static HashSet getPhone(String login) {
        return phoneMap.get(login);
    }

    public static void getAllLogins() {
        System.out.println(phoneMap);

    }

    public static void saveToFile(File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String login : phoneMap.keySet()) {
                writer.write(login + ":" + phoneMap.get(login));
                writer.newLine();
            }
        }
    }

    public static void loadFromFile(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace("[", "").replace("]", "");
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    HashSet<String> phone = new HashSet<>();
                    String login = parts[0];
                    Collections.addAll(phone, parts[1].split(", "));
                    phoneMap.put(login, phone);
                }
            }
        }
    }
}