package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) throws Exception {
        String znak1;
        Scanner scan = new Scanner(System.in);
        znak1 = scan.nextLine();
        int charValue = znak1.charAt(0);
        String next = String.valueOf((char) (charValue + 1));
        if (znak1.contains("z")) {
            System.out.println("a");
        } else {
            System.out.println(next);
        }
    }
}

