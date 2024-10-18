package org.example.programs;

import java.util.*;
import java.lang.*;
public class FindCoordinates
{
	public static void main(String[] args) {
	    String s = "DOWN UP 2xRIGHT DOWN 3xLEFT";
	    s = reduceString(s);
	    findCoordinates(s);
	}
    
    private static String reduceString(String s) {
        StringBuilder sb = new StringBuilder();
        String arr[] = s.split(" ");
        if(arr.length > 1) {
            for(String str: arr) {
                int n = 1;
                int x = str.indexOf("x");
                if(x != -1) {
                    n = Integer.parseInt(str.substring(0, x));
                    str = str.substring(x+1);
                }
                char c = str.charAt(0);
                for(int i = 0; i < n; i++)
                    sb.append(c);
            }
            return sb.toString();
        }
        return s;
    }
    private static void findCoordinates(String s) {
        int x = 0, y = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'U') 
                y++;
            else if(c == 'D')
                y--;
            else if(c == 'L')
                x--;
            else 
                x++;
        }
        System.out.println("("+x + "," + y+")");
    }
}