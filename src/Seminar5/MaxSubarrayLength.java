package Seminar5;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxSubarrayLength {
    public static void main(String[] args) {
        massive();
    }

    public static void massive() {
        int[] nums1 = { 3, 2, 1, 4, 5};
        int[] nums2 = {1, 2, 3, 2, 1, 3, 2, 1, 4, 5};
        Map<Integer, String> maxSubarray;
        maxSubarray = findCommonSubarray(nums1, nums2);
        System.out.println(Arrays.toString(nums1) + " \n" + Arrays.toString(nums2));
        System.out.println(maxSubarray.keySet() + " - размер " + maxSubarray.values() +  " - подмассив\n");
        nums1 = new int[]{0, 0, 0, 0, 0};
        nums2 = new int[]{0, 0, 0, 0, 0};
        maxSubarray = findCommonSubarray(nums1, nums2);
        System.out.println(Arrays.toString(nums1) + " \n" + Arrays.toString(nums2));
        System.out.println(maxSubarray.keySet() + " - размер " + maxSubarray.values() +  " - подмассив\n");
    }

    public static Map<Integer, String> findCommonSubarray(int[] nums1, int[] nums2) {
        int maxLength = 0;
        int startIndex = 0;
        String result = "Нету";
        int[] subarray;
        List<Integer> nums1List = Arrays.stream(nums1).boxed().toList();
        List<Integer> nums2List = Arrays.stream(nums2).boxed().toList();
        for (int i = 0; i < nums1List.size(); i++) {
            for (int j = 0; j < nums2List.size(); j++) {
                if (nums1List.get(i).equals(nums2List.get(j))) {
                    int currentLength = 1;
                    int x = i;
                    int y = j;
                    while (++x < nums1List.size() && ++y < nums2List.size() && nums1List.get(x).equals(nums2List.get(y))) {
                        currentLength++;
                    }
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        startIndex = i;
                    }
                }
            }
        }
        if (maxLength > 0) {
            subarray = new int[maxLength];
            System.arraycopy(nums1, startIndex, subarray, 0, maxLength);
            result = Arrays.toString(subarray);
        }
        Map<Integer, String> resultat = new HashMap<>();
        resultat.put(maxLength, result);
        return resultat;
    }
}