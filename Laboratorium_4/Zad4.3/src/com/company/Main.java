package com.company;

public class Main {

    public static void main(String[] args) {
        class Student extends Person{
            private String program;
            private int year;
            private double fee;
            public Student(String name, String address, String program, int year, double fee){
                super(name,address);
                this.program=program;
                this.year=year;
                this.fee=fee;
            }
            public String getProgram(){
                return program;
            }
            public void setProgram(String program){
                this.program=program;
            }
            public int getYear(){
                return year;
            }
            public void setYear(int year){
                this.year=year;
            }
            public double getFee(){
                return fee;
            }
            public void setFee(double fee){
                this.fee = fee;
            }
            @Override
            public String toString(){
                return "Student{program='"+getProgram()+"', year="+getYear()+", fee="+getFee()+"}";
            }
        }
        class Staff extends Person {
            private String school;
            private double pay;

            public Staff(String name, String address, String school, double pay) {
                super(name, address);
                this.school = school;
                this.pay = pay;
            }

            public String getSchool() {
                return school;
            }

            public void setSchool(String school) {
                this.school = school;
            }

            public double getPay() {
                return pay;
            }

            public void setPay(double pay) {
                this.pay = pay;
            }

            @Override
            public String toString() {
                return "Staff{school='" + getSchool() + "', pay=" + getPay() + "}";
            }
        }
        }
}
