package Seminar3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class HomeWork3 {

    public static void main(String[] args) {
        // Задание 1
        ArrayList<Integer> list = listNum();
        normalizeString(list);
        //Задание 2
        ArrayList<Integer> list2 = listNum();
        delnum(list2);
        // Задание 3
        ArrayList<Integer> list3 = listNum();
        mergeSort(list3,0, list3.size()-1);
        System.out.println(list3 + " - Отсортировали");
    }

    public static ArrayList<Integer> listNum() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        int listSize = random.nextInt(5,15);
        for (int i = 0; i < listSize; i++) {
            arrayList.add(random.nextInt(100));
        }
        System.out.println(arrayList);
        return arrayList;
    }

    public static void normalizeString(ArrayList<Integer> list) {
        // найти минимальное число и максимальное использую сортировку из 3 задания
        mergeSort(list, 0,list.size()-1);
        int min = list.get(0);
        int max= list.get(list.size()-1);
//        int max = list.get(0);
//        int min = list.get(0);
//        for (Integer integer : list) {
//            if (integer > max) {
//                max = integer;
//            } else if (integer < min) {
//                min = integer;
//            }
//        }
        // найти среднее арифметическое
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        double avg = (double) sum / list.size();
        System.out.printf("Avg: %s \nmax: %s \nmin: %s\n", avg, max, min);
        System.out.println();
    }

    public static void delnum(ArrayList<Integer> list) {
        // Удаляем не четные числа
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list + " - Удалили четные числа");
        System.out.println();
    }

    // Сортировка слиянием
    public static void mergeSort(ArrayList<Integer> array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
    public static void merge(ArrayList<Integer> array, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= right) {
            if (array.get(i) < array.get(j)) {
                temp[k] = array.get(i);
                i++;
            } else {
                temp[k] = array.get(j);
                j++;
            }
            k++;
        }
        while (i <= middle) {
            temp[k] = array.get(i);
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = array.get(j);
            j++;
            k++;
        }
        for (int l = 0; l < temp.length; l++) {
            array.set(left + l, temp[l]);  // копируем отсортированный массив обратно в исходный слева направо
        }
    }
}
