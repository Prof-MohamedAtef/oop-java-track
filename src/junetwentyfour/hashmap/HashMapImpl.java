package junetwentyfour.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);

        // Display the HashMap
        System.out.println("Initial HashMap: " + map);

         // Retrieve a value
         int appleCount = map.get("Apple");
         System.out.println("Count of Apples: " + appleCount);

         // Update a value
        map.put("Apple", 4);
        appleCount = map.get("Apple");
        System.out.println("Updated Appl value: " + appleCount);
        System.out.println("Updated HashMap : " + map);

        // Remove a value
        map.remove("Banana");
        System.out.println("HashMap after removal: " + map);
        
        // Check if a key exists
        boolean hasOrange = map.containsKey("Orange");
        System.out.println("Does the map contain 'Orange'? " + hasOrange);

        // Iterate through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
