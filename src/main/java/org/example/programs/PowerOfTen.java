package org.example.programs;

public class PowerOfTen {
    public static void main(String[] args) {
        int n = 100001;
        System.out.println(checkPower(n));
    }

    private static boolean checkPower(int n) {
        int a = 0, b = 0, c = 0;
        while (n != 0) {
            int temp = n % 10;
            if (temp == 0)
                b++;
            else if (temp == 1)
                a++;
            c++;
            n = n / 10;
        }
        return (a == 1 && b == c - 1);
    }
}
