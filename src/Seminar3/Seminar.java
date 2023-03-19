package Seminar3;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Seminar {

    public static void main(String[] args) {
        String[] elements = {"apple", "banana", "orange", "pear", "kiwi"};
        Stack<String> stack = new Stack<>();
        for (String element : elements) {
            stack.push(element);
        }
        System.out.println("Содержимое стэка:");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
    }
//        LinkedList<String> linkedList = new LinkedList<>();
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Введите строку или print~num для вывода и удаления элемента:");
//            String input = scanner.nextLine();
//            if (input.startsWith("print~")) {
//                try {
//                    int index = Integer.parseInt(input.substring(6));
//                    String element = linkedList.remove(index);
//                    System.out.println("Элемент \"" + element + "\" удален из позиции " + index);
//                } catch (NumberFormatException e) {
//                    System.out.println("Ошибка: введите числовое значение после знака ~");
//                } catch (IndexOutOfBoundsException e) {
//                    System.out.println("Ошибка: в списке нет элемента с таким индексом");
//                }
//            } else {
//                linkedList.add(input);
//            }
//            System.out.println("Текущий список элементов:");
//            for (String element : linkedList) {
//                System.out.println(element);
//            }
//        }
//            LinkedList<String> inputList = new LinkedList<>();
//            Scanner scanner = new Scanner(System.in);
//            while (true) {
//                System.out.println("Введите строку или print для вывода в обратном порядке, или stop для выхода:");
//                String input = scanner.nextLine();
//                if (input.equalsIgnoreCase("print")) {
//                    System.out.println("Строки в обратном порядке:");
//                    for (int i = inputList.size() - 1; i >= 0; i--) {
//                        System.out.println(inputList.get(i));
//                    }
//                } else if (input.equalsIgnoreCase("stop")) {
//                    System.out.println("Программа завершена.");
//                    break;
//                } else {
//                    inputList.add(input);
//                }
//            }
//        }


        /**
         принимает строки от пользователя. Если введено print, выводим с конца. Выходим по stop.
         */


//            Stack<String> stack = new Stack<String>();
//            while (true){
//                System.out.print("Enter value: ");
//                String s = input.nextLine();
//                if (s.equals("print")){
//                    while(!stack.isEmpty()){
//                        System.out.println(stack.pop());
//                    }
//                }else if(s.equals("stop")){
//                    break;
//                }else{
//                    stack.push(s);
//                    System.out.println(stack);
//                }
//            }
//            input.close();
//        }

//    }

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


//    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<Object>();
//
//        // Заполняем список строками и целыми числами
//        list.add("строка 1");
//        list.add(10);
//        list.add("строка 2");
//        list.add(20);
//        list.add("строка 3");
//        list.add(30);
//
//        // Проходим по списку и удаляем целые числа
//        for (int i = list.size() - 1; i >= 0; i--) {
//            Object obj = list.get(i);
//            if (obj instanceof Integer) {
//                list.remove(i);
//            }
//        }
//
//        // Выводим список без целых чисел
//        System.out.println(list);
//
//        }

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Меркурий");
//        list.add("Венера");
//        list.add("Земля");
//        list.add("Марс");
//        list.add("Юпитер");
//        list.add("Сатурн");
//        list.add("Уран");
//        list.add("Нептун");
//        list.add("Марс");
//        list.add("Земля");
//
//        String prevPlanet = null;
//        int count = 0;
//        list.sort(null);
//        // Выводим названия планет и количество их повторений
//        for (String planet : list) {
//            if (planet.equals(prevPlanet)) {
//                count++;
//            } else {
//                if (prevPlanet != null) {
//                    System.out.println(prevPlanet + ": " + count);
//                }
//                prevPlanet = planet;
//                count = 1;
//            }
//        }
//        // Выводим информацию о последней планете в списке
//        System.out.println(prevPlanet + ": " + count);

//        Map<String, Integer> planetCounter = new HashMap<>();
//        for (String planet : list) {
//            if (planetCounter.containsKey(planet)) {
//                int count = planetCounter.get(planet);
//                planetCounter.put(planet, count + 1);
//            } else {
//                planetCounter.put(planet, 1);
//            }
//        }
//        System.out.println("Названия планет и количество их повторений:");
//        for (Map.Entry<String, Integer> entry : planetCounter.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//        System.out.println(planetsList);
//        fillCatalog();
//    }

//    public static void fillCatalog() {
//        // Заполнение данными
//        List<String>[] catalog;
//        catalog.add(new ArrayList<>(Arrays.asList("Детективы", "Робин Гуд", "Шерлок Холмс")));
//        catalog.add(new ArrayList<>(Arrays.asList("Фантастика", "Властелин Колец", "Мастер и Маргарита")));
//        catalog.add(new ArrayList<>(Arrays.asList("Научно-популярное", "Архитектура компьютера", "Искусство программирования")));
//        for (List<String> item: catalog)
//            System.out.println(item);
//
//    }

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
//}
