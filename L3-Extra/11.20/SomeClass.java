package com.java.howtoprogram;

public class SomeClass {

    private int number;

    public SomeClass(int number) throws Exception {
        if (number == 0) {
            throw new Exception("Zero is invalid");
        }
    }
}
