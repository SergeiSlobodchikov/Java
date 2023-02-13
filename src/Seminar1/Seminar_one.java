//import java.time.LocalDateTime;
//public class Seminar_one {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);
//    }
//}

//import java.util.Scanner;
//public class Seminar_one {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите имя: ");
//        String name = scanner.nextLine();
//        System.out.println("Привет, " + name + "!");
//    }
//}

//public class Seminar_one{
//    public static void main(String[] args) {
//        int[] array = {1, 1, 0, 1, 1, 1};
//        int maxSequence = 0;
//        int currentSequence = 0;
//        for (int i : array) {
//            if (i == 1) {
//                currentSequence++;
//            } else {
//                if (currentSequence > maxSequence) {
//                    maxSequence = currentSequence;
//                }
//                currentSequence = 0;
//            }
//        }
//        if (currentSequence > maxSequence) {
//            maxSequence = currentSequence;
//        }
//        System.out.println(maxSequence);
//    }
//}

//import java.util.Arrays;
//
//public class  Seminar_one {
//    public static void main(String[] args) {
//        int[] nums = {3, 3, 3, 2, 2, 3, 2, 2};
//        int val = 3;
//        int j = 0;
//        int temp = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                temp = nums[j];
//                nums[j] = nums[i];
//                nums[i] = temp;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//    }
//}

public class Seminar_one {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "нету";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] array = {"кот", "котенок", "кошка", "комар", "ток"};
        System.out.println("Общий префикс: " + longestCommonPrefix(array));
    }
}