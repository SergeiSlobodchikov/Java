package Seminar5.HomeWork;

public class Main {
    public static void main(String[] args) {
        PhoneBook one = new PhoneBook();
        one.menu();
        System.out.println();
        String[] names = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        NameCounts.nameCounts(names);
    }
}
