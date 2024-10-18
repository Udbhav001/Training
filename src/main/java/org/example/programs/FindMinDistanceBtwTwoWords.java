package org.example.programs;

import java.util.Arrays;

public class FindMinDistanceBtwTwoWords {
    public static void main(String[] args) {
        String s = "the quick the brown quick brown the frog";
        System.out.println(finMin(s, "quick", "frog"));
    }
    private static int finMin(String str, String s1, String s2) {
        String[] arr = str.split(" ");
        int minS1 = Integer.MAX_VALUE, minS2 = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(s1))
                minS1 = i;
            else if(arr[i].equals(s2))
                minS2 = i;
            if(minS1 != Integer.MAX_VALUE && minS2 != Integer.MAX_VALUE)
                min = Math.min(min, Math.abs(minS2-minS1-1));
        }
        min = Math.min(min, Math.abs(minS2-minS1));
        return min;
    }
}
