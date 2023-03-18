package Seminar5.HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class NameCounts {


    public static void nameCounts(String[] names) {
        HashMap<String, Integer> nameCounts = new HashMap<>();
        for (String name : names) {
            String[] parts = name.split(" ");
            String firstName = parts[0];
            nameCounts.put(firstName, nameCounts.getOrDefault(firstName, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedNameCounts = new ArrayList<>(nameCounts.entrySet());
        sortedNameCounts.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> entry : sortedNameCounts) {
            if (entry.getValue() >= 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
