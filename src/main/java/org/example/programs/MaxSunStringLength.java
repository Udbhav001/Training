package org.example.programs;

import java.util.*;
import java.lang.*;
public class MaxSunStringLength
{
	public static void main(String[] args) {
	    String arr[] = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        System.out.println(maxSubString(arr, "ODG"));
	}

    private static int maxSubString(String arr[], String key) {
        int max = 0;
        for(String s: arr) {
            if(s.contains(key))
                max = Math.max(max, s.length());
        }
        return max;
    }


}