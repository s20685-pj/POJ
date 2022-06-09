package com.company;

import java.util.Scanner;
import java.io.File;

class Main{
    public static void main(String[] args){
        String text;
        Scanner scan = new Scanner(System.in);
        text = scan.nextLine().toString();
        int index = text.lastIndexOf('/');
        if(index > 0){
            String extension= text.substring(index+1);
            System.out.println(extension);
        }
    }
}