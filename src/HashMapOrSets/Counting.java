package HashMapOrSets;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Counting {

    public static void main(String[] args) {
        String[] names = {"Aman", "Kajal", "Abhishek", "Lalit", "Sadhana", "Aman"};
        HashMap<String, Integer> countMap = new HashMap<>();

        for (String name : names) {
            // If countMap doesn't contain name

            if (!countMap.containsKey(name)){
                countMap.put(name, 1);
            } else {
                countMap.put(name, countMap.get(name) + 1);
            }
        }
        System.out.println(countMap);
    }
}
