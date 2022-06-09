package com.company;

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        String text;
        Scanner scan = new Scanner(System.in);
        text = scan.nextLine().toString();
        String text2 = text.substring(0, text.indexOf("@"));
        System.out.println(text2);
    }
}
