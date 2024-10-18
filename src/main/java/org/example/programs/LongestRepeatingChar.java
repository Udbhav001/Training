package org.example.programs;

public class LongestRepeatingChar {
    public static void main(String[] args) {
        String s = "aaaaxabbbbbCCddd";
        System.out.println(findMaxRepChar(s));
    }

    private static int findMaxRepChar(String s) {
        int res = 0;
        int count = 1;
        int max = 0;
        int pre = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                count++;
            else {
                if (max < count) {
                    max = count;
                    res = pre;
                }
                count = 1;
                pre = i;
            }
        }
        if (max < count)
            res = pre;
        return res;
    }
}
