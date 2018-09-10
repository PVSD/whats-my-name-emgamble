package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner nameReader = new Scanner(System.in);
       System.out.println("What is your first name?");
       String a =  nameReader.nextLine();
       System.out.println("What is your last name?");
       String b = nameReader.nextLine();
       System.out.println("Your full name is " + a + b + ".");




    }
}
