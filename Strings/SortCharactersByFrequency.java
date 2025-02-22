package Strings;
import java.util.*;

class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        
        // Step 1: Build HashMap (Count Frequencies)
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        System.out.println("HashMap (Character Frequencies): " + hm);
        
        // Step 2: Insert into PriorityQueue (Max Heap)
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        // System.out.println(hm.entrySet());// same as hashmap output, but just in the [] and not in {}
        pq.addAll(hm.entrySet());
        
        System.out.println("Initial Priority Queue: " + pq);
        
        // Step 3: Build the output string
        StringBuilder result = new StringBuilder();
        
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            System.out.println("Polled from PQ: " + entry);
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
            System.out.println("Current result: " + result);
            System.out.println("Priority Queue after polling: " + pq);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String sortedString = frequencySort("tree");
        System.out.println("Final Sorted String: " + sortedString);
    }
}
