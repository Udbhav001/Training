package org.example.programs;

import java.util.HashMap;
import java.util.Map;

public class FindMaxAverage {
    public static void main(String[] args) {
        String [][]arr = {{"Charles", "84"},
        {"John", "100"},
        {"Andy", "37"},
        {"John", "23"},
        {"Charles", "20"}};
        Object[] res = findMaxAverage(arr);
        System.out.println(res[0] + " " + res[1]);
    }

    private static Object[] findMaxAverage(String[][] arr) {
        Map<String, Integer> map = new HashMap<>();
        int maxMarks = 0;
        String name  = "";
        for(String []a: arr) {
            map.put(a[0], map.getOrDefault(a[0], 0 ) + Integer.parseInt(a[1]));
            if(map.get(a[0]) > maxMarks) {
                maxMarks = map.get(a[0]);
                name = a[0];
            }
        }
        float c = 0;
        for(String[] a : arr) {
            if(a[0].equals(name))
                c++;
        }
        return new Object[]{maxMarks/c, name};
    }
}
