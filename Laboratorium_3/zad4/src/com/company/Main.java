package com.company;

class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(RandomNumbers.randomElement());
    }
}
class RandomNumbers{
    static int[] tab = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    static int randomElement(){
        int rand = (int) Math.floor(Math.random()*tab.length);
        return tab[rand];
    }
}
