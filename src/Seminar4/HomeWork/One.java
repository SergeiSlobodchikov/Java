package Seminar4.HomeWork;

import java.util.LinkedList;

public class One {

        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("apple");
            linkedList.add("banana");
            linkedList.add("orange");
            linkedList.add("pear");
            linkedList.add("kiwi");
            System.out.println("Исходный список: " + linkedList);
            LinkedList<String> reversedList = reverseLinkedList(linkedList);
            System.out.println("Перевернутый список: " + reversedList);
        }
        public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
            LinkedList<String> reversedList = new LinkedList<>();
            for (int i = list.size() - 1; i >= 0; i--) {
                reversedList.add(list.get(i));
            }
            return reversedList;
        }

}
