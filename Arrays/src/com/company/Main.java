package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int a = 1, b = 3;
        int[][] taba = new int[1][3];
        int[][] tabb = new int[1][3];
        int[][] tabc = new int[1][3];
        Scanner arr = new Scanner(System.in);
        for (int i = 0; i <= a - 1; i++) {                //Pobiera tablice A
            for (int j = 0; j <= b - 1; j++) {
                taba[i][j] = arr.nextInt();
            }
        }
        System.out.println("\n");
        for (int i = 0; i <= a - 1; i++) {                // Pobiera tablice B
            for (int j = 0; j <= b - 1; j++) {
                tabb[i][j] = arr.nextInt();
            }
        }
        System.out.println("\n");                        //Działanie Matematyczne(Mnożenie tablic)
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                tabc[i][j] = (taba[i][j] * tabb[i][j]);
                System.out.print(tabc[i][j] + " ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int sum = IntStream.of(tabc[i][j]).sum();
                System.out.println(sum);
            }
        }
    }
}
