package org.example.programs;

public class Atoi {
    public static void main(String[] args) {
        String s = "13a90";
        System.out.println(convertToNumber(s));
    }
    private static int getAtoi(String s) {
        try {
            return s.charAt(0) == '-' ?  -Integer.parseInt(s.substring(1)) : Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
    }

    private static int convertToNumber(String s) {
        int n = 0;
        boolean flag = false;
        int i = 0;
        if(s.charAt(0) == '-') {
            flag = true;
            i++;
        }
        for(; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9')
                n = n * 10 + c - '0';
            else
                return -1;
        }
        return flag ? -n : n;
    }
}
