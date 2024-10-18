package org.example.programs;

import java.util.*;
import java.lang.*;
public class divByThree
{
	public static void main(String[] args) {
	    String s = "12345632189765";
        System.out.println(reverseDivByThreeNew(s));
	}

    private static String reverseDivByThreeNew(String s) {
        int left = 0, right = s.length();
        char[] arr = s.toCharArray();
        while(left < right) {
            if((arr[left] - '0') % 3 == 0) {
                while((arr[--right] - '0') % 3 == 0) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }
            left++;
        }
        return new String(arr);
    }
    
    private static String reverseDivByThree(String s) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            if(n % 3 == 0)  
                list.add(n);
        }
        int pos = list.size();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = c - '0';
            if(n % 3 == 0)  
                sb.append(list.get(--pos));
            else
                sb.append(c);
        }
        return sb.toString();
    }
}