package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.regex.*;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String K = scan.nextLine();
        Vector<String> slowa = new Vector<>();
        String temp = "";
        String wynikPrzed = "";
        String wynikPrzy = "";
        Boolean przedrostki[];
        Boolean przyrostki[];
        int i = 0;
        while (i < T.length()) {
            if (T.charAt(i) == ' ') {
                slowa.add(temp.trim());
                temp = "";
            }
            temp = temp + T.charAt(i);
            i++;
        }
        przedrostki = new Boolean[slowa.size() + 1];
        przyrostki = new Boolean[slowa.size() + 1];
        if (!temp.equals("")) slowa.add(temp.trim());
        for (int j = 0; j < slowa.size(); j++) {
            przedrostki[j] = false;
            przyrostki[j] = false;
        }
        for (int j = 0; j < slowa.size(); j++) {
            temp = slowa.get(j);
            if (temp.contains(K)) {
                if (temp.indexOf(K) == 0) przedrostki[j] = true;
                else przyrostki[j] = true;
            }
        }
        for (int j = 0; j < slowa.size(); j++) {
            if (przedrostki[j]) System.out.println(K + " jest przedrostkiem słowa " + slowa.get(j));
        }
        for (int j = 0; j < slowa.size(); j++) {
            if (przyrostki[j]) System.out.println(K + " jest przyrostkiem słowa " + slowa.get(j));
        }
    }
}
