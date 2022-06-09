package com.company;

import java.util.Scanner;

class strTK {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String K = scan.nextLine();
        System.out.println(test(T,K));
    }

    public static String test(String T, String K) {

        int dlugosc = K.length();

        for (int i = T.length() - dlugosc; i >= 0; i--) {
            if (T.regionMatches(true, i, K, 0, dlugosc))
                return "Słowo " + K + " znajduje się w ciągu";
        }
        return "Słowo " + K + " nie znajduje się w ciągu";
    }
}
