package Seminar1;
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