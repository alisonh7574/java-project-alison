package week10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapSort_Sahar {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a",2);
        map.put("c",5);
        map.put("d",1);
        map.put("b",3);

        System.out.println("original " + map);
        System.out.println(sortValue(map));
    }

    public static Map<String, Integer> sortValue(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> entries = entries = new ArrayList<>(map.entrySet()); // Using List of entries Key String, Value Integer. Each entry is Key value pair
        for (int i = 0; i < entries.size(); i++) { // loop and nested loop to go through entries
            for (int j = 0; j < entries.size() -1; j++) { // you want to move the smallest value to the front and largest to the end. add -1 so its not out of bounds
                if (entries.get(j).getValue() > entries.get(j + 1).getValue()) { // entry means element of the list. map entry ex: a=4.
                    // If the value is more than the value next to it, swap with the one next to it. j+1 is how you read the one next to it

                    Map.Entry<String, Integer> temp = entries.get(j); // place to store the temp variables so you dont lose one of them
                    entries.set(j, entries.get(j + 1)); // in j position set the value next to j
                    entries.set(j + 1, temp); //adding temp back in to complete the swap
                }

            }

        }

        Map<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : entries) {
            sorted.put(each.getKey(), each.getValue());
        }
        return sorted;
    }
}

/*
Map - Sort the map by values
Write a method that can sort the Map by values
*/
