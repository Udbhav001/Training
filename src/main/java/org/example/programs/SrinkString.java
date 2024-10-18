package org.example.programs;

import java.util.*;
import java.lang.*;
public class SrinkString
{
	public static void main(String[] args) {
	    String s = "aabbbycyyc";
        System.out.println(shrink(s));
	}
    
    private static String shrink(String s) {
        int arr[] = new int[26];
        for(int i = 0; i < s.length(); i++)
            arr[s.charAt(i)-'a']++;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) { 
            char c = s.charAt(i);
            int n =  c - 'a';
            if(arr[n] != 0) {
                sb.append(c + "" + arr[n]);
                arr[n] = 0;
            }
        }
        return sb.toString();
    }
    
}