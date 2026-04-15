package lab7;

import java.util.*;

public class lab7_c {

    public static void main(String[] args) {
        // Step 3: HashMap Demonstration (Unordered)
        System.out.println("--- HashMap Output (Random Order) ---");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Zebra", 10);
        hashMap.put("Apple", 50);
        hashMap.put("Mango", 30);
        hashMap.put("Banana", 20);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Step 4: TreeMap Demonstration (Sorted by Key)
        System.out.println("\n--- TreeMap Output (Sorted Order) ---");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 10);
        treeMap.put("Apple", 50);
        treeMap.put("Mango", 30);
        treeMap.put("Banana", 20);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
