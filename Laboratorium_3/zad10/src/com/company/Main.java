package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text1 = br.readLine();
        String text2 = br.readLine();
        int dlugoscTekstu1 = text1.length();
        int dlugoscTekstu2 = text2.length();
        int dlugoscObu = Math.min(dlugoscTekstu1, dlugoscTekstu2);
        if (text1.contains(text2)) {
            System.out.println("The strings are equal");
        } else {
            for (int i = 0; i < dlugoscObu; i++) {
                if (text1.charAt(i) != text2.charAt(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
