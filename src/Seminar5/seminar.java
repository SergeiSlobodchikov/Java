package Seminar5;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class seminar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Введите первое слово: ");
//        String firstWord = input.nextLine();
//        System.out.println("Введите второе слово: ");
//        String secondWord = input.nextLine();
//        input.close();
//        System.out.println(isIsomorf(firstWord, secondWord, 1));
        String Word = input.nextLine();
        System.out.println(checkBrackets(Word));
        input.close();
    }
//    public static Boolean isIsomorf(String str1, String str2, int flag){
//        if (str1.length() != str2.length()) return false;
//        else {
//            Map<Character, Character> newMap = new HashMap<>();
//            for (int i = 0; i < str1.length(); i++) {
//                if (newMap.containsKey(str1.charAt(i)) && str2.charAt(i) != newMap.get(str1.charAt(i))){
//                    return false;
//                }
//                else newMap.put(str1.charAt(i), str2.charAt(i));
//            }
//            if (flag == 1) return isIsomorf(str2, str1, 0);
//            return true;
//        }
//    }

    public static boolean checkBrackets(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '(' || c == '[' || c == '{') { // открывающая скобка добавляем ее в стек
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') { // закрывающая скобка, то проверяем соответствие открывающей скобке
                if (stack.isEmpty()) { // если стек пуст, то нет соответствующей открывающей скобки
                    return false;
                }

                char last = stack.pop(); // извлекаем последнюю открывающую скобку из стека

                if ((c == ')' && last != '(') || (c == ']' && last != '[') || (c == '}' && last != '{')) { // проверяем соответствие скобок
                    return false;
                }
            }
        }

        return stack.isEmpty(); // если в стеке не осталось открывающих скобок, то выражение верно
    }
}


