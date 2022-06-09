package com.company;

import java.util.Scanner;
import java.util.regex.*;

class Main {
    public static void main(String[] args) throws Exception {
        String wynik;
        Scanner scan = new Scanner(System.in);
        wynik = scan.nextLine();
        wynik = wynik.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(wynik);
    }
}
