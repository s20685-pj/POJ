package com.company;

import java.util.Scanner;
import java.util.regex.*;

class Main {
    public static void main(String[] args) throws Exception {
        String wynik;
        Scanner scan = new Scanner(System.in);
        wynik = scan.nextLine();
        usuwanieZaladowanychZer(wynik);
    }
    public static void usuwanieZaladowanychZer(String text){
        String regex = "0";
        text = text.replaceAll(regex, "");
        System.out.println(text);
    }
}
