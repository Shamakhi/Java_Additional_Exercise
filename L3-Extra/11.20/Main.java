package com.java.howtoprogram;

public class Main{

    public static void main(String[] args) {

        try {
            SomeClass test = new SomeClass(0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
