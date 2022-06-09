package com.company;
import java.util.Scanner;


class Main{
    public static void main(String[] args) {
        String text1;
        String text2;
        String text3;
        Scanner scan = new Scanner(System.in);
        text1 = scan.nextLine();
        text2 = scan.nextLine();
        text3 = scan.nextLine();
        String wynik = text1.replaceAll(text2,text3);
        System.out.println(wynik);
    }
}