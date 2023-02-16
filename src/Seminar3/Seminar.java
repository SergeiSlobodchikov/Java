package Seminar3;
import java.util.*;
import java.util.ArrayList;

public class Seminar {
//    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o";
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//        // сравнение по ссылкам
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s1 == s5);
//        System.out.println(s1 == s5);
//        System.out.println();
//        // сравнение через метод equals()
//        System.out.println(s1.equals(s2)); // true
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equals(s4));
//        System.out.println(s1.equals(s5));
//        System.out.println(s1.equals(s6));
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            list.add(random.nextInt(0,100));
//        }
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//    }


    public static void main(String[] args) {
        ArrayList<String> planetsList = new ArrayList<>();
        planetsList.add("Меркурий");
        planetsList.add("Венера");
        planetsList.add("Земля");
        planetsList.add("Марс");
        planetsList.add("Юпитер");
        planetsList.add("Сатурн");
        planetsList.add("Уран");
        planetsList.add("Нептун");
        planetsList.add("Марс");
        planetsList.add("Земля");
        Map<String, Integer> planetCounter = new HashMap<>();
        for (String planet : planetsList) {
            if (planetCounter.containsKey(planet)) {
                int count = planetCounter.get(planet);
                planetCounter.put(planet, count + 1);
            } else {
                planetCounter.put(planet, 1);
            }
        }
        System.out.println("Названия планет и количество их повторений:");
        for (Map.Entry<String, Integer> entry : planetCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(planetsList);
        fillCatalog();
    }

    public static void fillCatalog() {
        // Заполнение данными
        List<String>[] catalog;
        catalog.add(new ArrayList<>(Arrays.asList("Детективы", "Робин Гуд", "Шерлок Холмс")));
        catalog.add(new ArrayList<>(Arrays.asList("Фантастика", "Властелин Колец", "Мастер и Маргарита")));
        catalog.add(new ArrayList<>(Arrays.asList("Научно-популярное", "Архитектура компьютера", "Искусство программирования")));
        for (List<String> item: catalog)
            System.out.println(item);

    }

//    ArrayList<String> planets = new ArrayList<>(Arrays.asList("Mars",
//            "Uranus",
//            "Earth",
//            "Saturn",
//            "Mars",
//            "Uranus",
//            "Earth",
//            "Saturn",
//            "Pluton",
//            "Pluton",
//            "Pluton",
//            "Jupiter"));
//
////        Map<String,Integer> counPlanet = new HashMap<>();
//
//        Collections.sort(planets);
//    int count = 1;
//
//        for (int i = 1; i < planets.size(); i++) {
//        if (planets.get(i - 1).equals(planets.get(i))) {
//            count++;
//        } else {
//            System.out.println(planets.get(i - 1) + " " + count);
//            count = 1;
//        }
//    }
//        for (int i = 1; i < planets.size(); i++) {
//        if (planets.get(i-1).equals(planets.get(i))) {
//            planets.remove(i);
//            i--;
//        }
//    }
//
//    Iterator<String> iter = planets.iterator();
//
//        while (iter.hasNext()){
//        iter.next();
//        iter.remove();
//    }
//
//        System.out.println(planets);
}
