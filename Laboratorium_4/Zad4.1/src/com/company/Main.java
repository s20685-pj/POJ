package com.company;

public class Main {

    public static void main(String[] args) {

        class Circle{
            private double radius = 1.0;
            private String color = "red";
            public Circle(double radius){
                this.radius = radius;
            }
            public Circle(){

            }
            public Circle(double radius, String color){
                this.radius = radius;
                this.color = color;
            }
            public double getRadius(){
                return radius;
            }
            public void setRadius(double radius){
                this.radius = radius;
            }
            public String getColor(){
                return color;
            }
            public void setColor(String color){
                this.color=color;
            }
            public double getArea(){
                double area = Math.PI * radius * radius;
                //String wynik = String.format("%.2f",area);
                return area;
            }
            public String toString(){
                return "Circle[radius="+getRadius()+", color='"+getColor()+"']";
            }
        }

    }
}
