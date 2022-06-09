package com.company;
import java.util.Scanner;

class Tekst {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String Alama = scan.nextLine();

        System.out.println(Alama.toUpperCase());
        System.out.println(Alama.toLowerCase());
        System.out.println(pierwsza(Alama));
        System.out.println(wszystkie(Alama));
    }

    public static String pierwsza (String Tekst) {
        return Tekst.substring(0, 1).toUpperCase() + Tekst.substring(1);
    }

    public static String wszystkie (String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer Tekst = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            Tekst.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
        }
        return Tekst.toString().trim();
    }
}
