package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("enter a number between 15 to 20");
        int a;
        a=input.nextInt();
        switch (a){
            case 20:
                System.out.println("fantastic");
                break;
            case 19:
                System.out.println("awesome");
                break;
            case 18:
                System.out.println("brillant");
                break;
            case 17:
                System.out.println("amazing");
                break;
            case 16:
                System.out.println("nice");
                break;
            case 15:
                System.out.println("not that much good");
                break;
        }

	// write your code here
    }
}
